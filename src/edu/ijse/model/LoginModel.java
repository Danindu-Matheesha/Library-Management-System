/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.model;

import edu.ijse.db.DBConnection;
import edu.ijse.dto.LoginDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author User
 */
public class LoginModel {
    private final Connection connection;

    public LoginModel() throws ClassNotFoundException, SQLException {
        this.connection = (Connection) DBConnection.getInstance().getConnection();
    }

public String Login(LoginDto loginDto) throws Exception {
    String sql = "SELECT * FROM User WHERE Name = ? AND Password = ?";
    
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        // Set parameters for the prepared statement
        statement.setString(1, loginDto.getUserName());
        statement.setString(2, loginDto.getUserPassword());
        
        // Execute the query
        try (ResultSet resultSet = statement.executeQuery()) {
            // Check if the query returned any rows
            if (resultSet.next()) {
                return "Success";
            } else {
                return "Fail";
            }
        }
    }
}

}
