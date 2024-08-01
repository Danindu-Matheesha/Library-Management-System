/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.model;

import edu.ijse.db.DBConnection;
import edu.ijse.dto.BookDto;
import edu.ijse.dto.BorrowDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BorrowModel {
    private final Connection connection;

    public BorrowModel() throws ClassNotFoundException, SQLException {
        this.connection = (Connection) DBConnection.getInstance().getConnection();
    }

    public String saveBorrow(BorrowDto borrowDto) throws Exception{
        String sql = "INSERT INTO Borrow VALUES(?,?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, borrowDto.getBorrowId());
        statement.setString(2, borrowDto.getMemberId());
        statement.setString(3, borrowDto.getBookId());
        statement.setString(4, borrowDto.getBorrweDate());
        statement.setString(5, borrowDto.getReturnDate());
        
        return statement.executeUpdate() >0 ? "Success Add Borrow" : "Error";
    }

    public ArrayList<BorrowDto> getAllBorrow() throws Exception{
        String sql = "SELECT * FROM Borrow";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();

        ArrayList<BorrowDto> borrowDtos = new ArrayList<>();

        while (rst.next()) {            
            BorrowDto dto = new BorrowDto(rst.getString("BorrowId"), rst.getString("MemberId"), rst.getString("BookId"),
            rst.getString("BorrowDate"),rst.getString("ReturnDate"));
            borrowDtos.add(dto);
        }
        return borrowDtos;
    }

    public BorrowDto getBorrow(String BorrowId) throws Exception{
        String sql = "SELECT * FROM Borrow WHERE BorrowId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, BorrowId);
        ResultSet rst = statement.executeQuery();
        while (rst.next()) {
            BorrowDto dto = new BorrowDto(rst.getString("BorrowId"), rst.getString("MemberId"), rst.getString("BookId"),
            rst.getString("BorrowDate"),rst.getString("ReturnDate"));
            return dto;
        }
        return null;
    }

    public String deleteBorrow(String borrowId) throws Exception{
        String sql = "DELETE FROM Borrow WHERE BorrowId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, borrowId);

        return statement.executeUpdate() >0 ? "Success Delete Borrow" : "Error";

    }

    public String updateBorrow(BorrowDto borrowDto) throws Exception{
        String sql = "UPDATE Borrow SET MemberId = ?,  BookId = ?, BorrowDate = ?, ReturnDate = ? WHERE BorrowId = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, borrowDto.getMemberId());
        statement.setString(2, borrowDto.getBookId());
        statement.setString(3, borrowDto.getBorrweDate());
        statement.setString(4, borrowDto.getReturnDate());
        statement.setString(5, borrowDto.getBorrowId());

        return statement.executeUpdate() >0 ? "Success Upadete Borrow" : "Error";
    }
}