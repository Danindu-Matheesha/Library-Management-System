/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.model;

import edu.ijse.db.DBConnection;
import edu.ijse.dto.ReturnDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ReturnModel {
    private final Connection connection;

    public ReturnModel() throws ClassNotFoundException, SQLException {
        this.connection = (Connection) DBConnection.getInstance().getConnection();
    }

    public String saveReturn(ReturnDto returnDto) throws Exception{
        String sql = "INSERT INTO returnbooks VALUES(?,?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, returnDto.getReturnId());
        statement.setString(2, returnDto.getReturnDate());// ReturanDay == TodayDate
        statement.setInt(3, returnDto.getLateDates());
        statement.setInt(4, returnDto.getPrice());
        statement.setString(5, returnDto.getBorrowId());

        return statement.executeUpdate() >0 ? "Success" : "Fail";
    }

    public ArrayList<ReturnDto> getAllReturn() throws Exception{
        String sql = "SELECT * FROM returnbooks";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();

        ArrayList<ReturnDto> returnDtos = new ArrayList<>();

        while (rst.next()) {            
            ReturnDto dto = new ReturnDto(rst.getString("ReturnId"), rst.getString("ReturnDate"), rst.getInt("LateDates"),rst.getInt("Price"),rst.getString("BorrowId"));
            returnDtos.add(dto);// ReturanDay == TodayDate
        }
        return returnDtos;
    }

    public ReturnDto getReturn(String ReturnId) throws Exception{
        String sql = "SELECT * FROM returnbooks WHERE ReturnId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, ReturnId);
        ResultSet rst = statement.executeQuery();
        while (rst.next()) {
            ReturnDto dto = new ReturnDto(rst.getString("ReturnId"), rst.getString("ReturnDate"), rst.getInt("LateDates"),rst.getInt("Price"),rst.getString("BorrowId"));
            return dto;// ReturanDay == TodayDate
        }
        return null;
    }
}