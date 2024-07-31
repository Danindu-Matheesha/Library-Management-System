/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.ReturnDto;
import edu.ijse.model.BookModel;
import edu.ijse.model.ReturnModel;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ReturnController {

    private ReturnModel returnModel;

    public ReturnController() throws Exception {
        this.returnModel = new ReturnModel();
    }

    public String saveReturn(ReturnDto returnDto) throws Exception {
        String resp = returnModel.saveReturn(returnDto);
        return resp;
    }

    public ArrayList<ReturnDto> getAllReturn() throws Exception {
        ArrayList<ReturnDto> returnDtos = returnModel.getAllReturn();
        return returnDtos;
    }

    public ReturnDto searchReturn(String ReturnId) throws Exception {
        ReturnDto returnDto = returnModel.getReturn(ReturnId);
        return returnDto;
    }

}
