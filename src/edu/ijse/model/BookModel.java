/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.model;

import edu.ijse.db.DBConnection;
import edu.ijse.dto.BookDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BookModel {
    private final Connection connection;

    public BookModel() throws ClassNotFoundException, SQLException {
        this.connection = (Connection) DBConnection.getInstance().getConnection();
    }

    public String saveBook(BookDto bookDto) throws Exception{
        String sql = "INSERT INTO Books VALUES(?,?,?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, bookDto.getBookId());
        statement.setString(2, bookDto.getName());
        statement.setString(3, bookDto.getAuthor());
        statement.setString(4, bookDto.getPublisherName());
        statement.setString(5, bookDto.getPublishedDate());
        statement.setInt(6, bookDto.getPrice());
        
        return statement.executeUpdate() >0 ? "Success" : "Fail";
    }

    public ArrayList<BookDto> getAllBook() throws Exception{
        String sql = "SELECT * FROM Books";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();

        ArrayList<BookDto> bookDtos = new ArrayList<>();

        while (rst.next()) {            
            BookDto dto = new BookDto(rst.getString("BookId"), rst.getString("Name"), rst.getString("Author"),
            rst.getString("PublisherName"),rst.getString("PublishedDate"),rst.getInt("Price"));
            bookDtos.add(dto);
        }
        return bookDtos;
    }

    public BookDto getBook(String BookId) throws Exception{
        String sql = "SELECT * FROM Books WHERE BookId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, BookId);
        ResultSet rst = statement.executeQuery();
        while (rst.next()) {
            BookDto dto = new BookDto(rst.getString("BookId"), rst.getString("Name"), rst.getString("Author"),
            rst.getString("PublisherName"),rst.getString("PublishedDate"),rst.getInt("Price"));
            return dto;
        }
        return null;
    }

    public String deleteBook(String bookId) throws Exception{
        String sql = "DELETE FROM Books WHERE BookId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, bookId);

        return statement.executeUpdate() >0 ? "Success" : "Fail";

    }

    public String updateBook(BookDto bookDto) throws Exception{
        String sql = "UPDATE Books SET Name = ?,  Author = ?, PublisherName = ?, PublishedDate = ?,   Price = ? WHERE BookId = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, bookDto.getName());
        statement.setString(2, bookDto.getAuthor());
        statement.setString(3, bookDto.getPublisherName());
        statement.setString(4, bookDto.getPublishedDate());
        statement.setInt(5, bookDto.getPrice());       
        statement.setString(6, bookDto.getBookId());

        return statement.executeUpdate() >0 ? "Success" : "Fail";
    }
}