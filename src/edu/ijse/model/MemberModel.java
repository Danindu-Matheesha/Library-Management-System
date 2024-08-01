/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.model;

import edu.ijse.db.DBConnection;
import edu.ijse.dto.MemberDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MemberModel {
    private final Connection connection;

    public MemberModel() throws ClassNotFoundException, SQLException {
        this.connection = (Connection) DBConnection.getInstance().getConnection();
    }

    public String saveMember(MemberDto memberDto) throws Exception{
        String sql = "INSERT INTO MEMBERS VALUES(?,?,?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, memberDto.getMemberId());
        statement.setString(2, memberDto.getName());
        statement.setString(3, memberDto.getAddress());
        statement.setInt(4, memberDto.getPhoneNO());
        statement.setString(5, memberDto.getDOB());
        statement.setString(6, memberDto.getRegisterDate());
        

        return statement.executeUpdate() >0 ? "Success Add Member" : "Error";
    }

    public ArrayList<MemberDto> getAllMember() throws Exception{
        String sql = "SELECT * FROM Members";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();

        ArrayList<MemberDto> memberDtos = new ArrayList<>();

        while (rst.next()) {            
            MemberDto dto = new MemberDto(rst.getString("MemberId"), rst.getString("Name"), rst.getString("Address"),
            rst.getInt("PhoneNo"),rst.getString("DOB"),rst.getString("RegisterDate"));
            memberDtos.add(dto);
        }
        return memberDtos;
    }

    public MemberDto getMember(String MemberId) throws Exception{
        String sql = "SELECT * FROM Members WHERE MemberId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, MemberId);
        ResultSet rst = statement.executeQuery();
        while (rst.next()) {
            MemberDto dto = new MemberDto(rst.getString("MemberId"), rst.getString("Name"), rst.getString("Address"),
            rst.getInt("PhoneNo"),rst.getString("DOB"),rst.getString("RegisterDate"));
            return dto;
        }
        return null;
    }

    public String deleteMember(String memberId) throws Exception{
        String sql = "DELETE FROM members WHERE MemberId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, memberId);

        return statement.executeUpdate() >0 ? "Success Delete Member" : "Error";

    }

    public String updateMember(MemberDto memberDto) throws Exception{
        String sql = "UPDATE MEMBERS SET Name = ?, Address = ?, PhoneNo = ?, DOB = ?,  RegisterDate = ? WHERE MemberId = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, memberDto.getName());
        statement.setString(2, memberDto.getAddress());
        statement.setInt(3, memberDto.getPhoneNO());
        statement.setString(4, memberDto.getDOB());
        statement.setString(5, memberDto.getRegisterDate());
        statement.setString(6, memberDto.getMemberId());

        return statement.executeUpdate() >0 ? "Success Update Member" : "Error";
    }
}