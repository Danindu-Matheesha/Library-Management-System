/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.model;

import edu.ijse.db.DBConnection;
import edu.ijse.dto.CategoryDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CategoryModel {
    private final Connection connection;

    public CategoryModel() throws ClassNotFoundException, SQLException {
        this.connection = (Connection) DBConnection.getInstance().getConnection();
    }

    public String saveCategory(CategoryDto categoryDto) throws Exception{
        String sql = "INSERT INTO Categories VALUES(?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, categoryDto.getCatId());
        statement.setString(2, categoryDto.getName());
        statement.setString(3, categoryDto.getDescription());
        
        return statement.executeUpdate() >0 ? "Success" : "Fail";
    }

    public ArrayList<CategoryDto> getAllCategory() throws Exception{
        String sql = "SELECT * FROM Categories";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();

        ArrayList<CategoryDto> categoryDtos = new ArrayList<>();

        while (rst.next()) {            
            CategoryDto dto = new CategoryDto(rst.getString("CatId"), rst.getString("Name"), rst.getString("Description"));
            categoryDtos.add(dto);
        }
        return categoryDtos;
    }

    public CategoryDto getCategory(String CatId) throws Exception{
        String sql = "SELECT * FROM Categories WHERE CatId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, CatId);
        ResultSet rst = statement.executeQuery();
        while (rst.next()) {
            CategoryDto dto = new CategoryDto(rst.getString("CatId"), rst.getString("Name"), rst.getString("Description"));
            return dto;
        }
        return null;
    }

    public String deleteCategory(String catId) throws Exception{
        String sql = "DELETE FROM Categories WHERE catId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, catId);

        return statement.executeUpdate() >0 ? "Success" : "Fail";

    }

    public String updateCategory(CategoryDto categoryDto) throws Exception{
        String sql = "UPDATE Categories SET Name = ?, Description = ? WHERE CatId = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, categoryDto.getName());
        statement.setString(2, categoryDto.getDescription());
        statement.setString(3, categoryDto.getCatId());

        return statement.executeUpdate() >0 ? "Success" : "Fail";
    }
}