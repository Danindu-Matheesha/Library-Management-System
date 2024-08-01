/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.model;

import edu.ijse.db.DBConnection;
import edu.ijse.dto.SignUpDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SignUpModel {

    private final Connection connection;

    public SignUpModel() throws ClassNotFoundException, SQLException {
        this.connection = (Connection) DBConnection.getInstance().getConnection();
    }

    public String SignUp(SignUpDto userDto) throws Exception {
        String sql = "INSERT INTO User VALUES(?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, userDto.getUserId());
        statement.setString(2, userDto.getName());
        statement.setString(3, userDto.getPassword());

        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }

    public String updateSginup(SignUpDto signupDto) throws Exception {
        String sql = "UPDATE user SET Name = ?,  Password = ? WHERE UserId = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, signupDto.getName());
        statement.setString(2, signupDto.getPassword());
        statement.setString(3, signupDto.getUserId());

        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }

    public SignUpDto getUser(String UserId) throws Exception {
        String sql = "SELECT * FROM User WHERE UserId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, UserId);
        ResultSet rst = statement.executeQuery();
        while (rst.next()) {
            SignUpDto dto = new SignUpDto(rst.getString("Name"), rst.getString("Password"), rst.getString("UserId"));
            return dto;
        }
        return null;
    }
}
