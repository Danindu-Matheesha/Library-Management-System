/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.model;

import edu.ijse.db.DBConnection;
import edu.ijse.dto.UserDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserModel {
    private final Connection connection;

    public UserModel() throws ClassNotFoundException, SQLException {
        this.connection = (Connection) DBConnection.getInstance().getConnection();
    }

    public String SignUp (UserDto userDto) throws Exception{
        String sql = "INSERT INTO User VALUES(?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, userDto.getName());
        statement.setString(2, userDto.getPassword());
        
        return statement.executeUpdate() >0 ? "Success" : "Fail";
    }
}
