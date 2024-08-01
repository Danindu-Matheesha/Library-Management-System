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
        String sql = "INSERT INTO ReturnBooks VALUES(?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, returnDto.getBorrowId());
        statement.setString(2, returnDto.getReturnDate());// ReturanDay == TodayDate
        statement.setInt(3, returnDto.getLateDates());
        statement.setInt(4, returnDto.getPrice());

        return statement.executeUpdate() >0 ? "Success Add Return" : "Error";
    }

    public ArrayList<ReturnDto> getAllReturn() throws Exception{
        String sql = "SELECT * FROM returnbooks";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();

        ArrayList<ReturnDto> returnDtos = new ArrayList<>();

        while (rst.next()) {            
            ReturnDto dto = new ReturnDto(rst.getString("BorrowId"),rst.getString("ReturnDate"), rst.getInt("LateDates"),rst.getInt("Price"));
            returnDtos.add(dto);// ReturanDay == TodayDate
        }
        return returnDtos;
    }
}