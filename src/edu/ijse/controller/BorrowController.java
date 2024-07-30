/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.BorrowDto;
import edu.ijse.model.BorrowModel;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BorrowController {
     private BorrowModel borrowModel;

    public BorrowController() throws Exception{
        this.borrowModel = new BorrowModel();
    }

    public String saveBorrow(BorrowDto borrowDto) throws Exception{
        String resp = borrowModel.saveBorrow(borrowDto);
        return resp;
    }

    public ArrayList<BorrowDto> getAllBorrow() throws Exception{
        ArrayList<BorrowDto> borrowDtos = borrowModel.getAllBorrow();
        return borrowDtos;
    }

    public BorrowDto searchBorrow(String BorrowId) throws Exception{
        BorrowDto borrowDto = borrowModel.getBorrow(BorrowId);
        return borrowDto;
    }

    public String deleteBorrow(String borrowId) throws Exception{
        String resp = borrowModel.deleteBorrow(borrowId);
        return resp;
    }
    
    public String updateBorrow(BorrowDto borrowDto) throws Exception {
        String resp = borrowModel.updateBorrow(borrowDto);
        return resp;
    }
}
