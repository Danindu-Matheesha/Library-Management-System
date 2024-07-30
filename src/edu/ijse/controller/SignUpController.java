/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.SignUpDto;
import edu.ijse.model.SignUpModel;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SignUpController {
    private SignUpModel userModel;

    public SignUpController() throws Exception{
        this.userModel = new SignUpModel();
    }

    public String SignUp(SignUpDto userDto) throws Exception{
        String resp = userModel.SignUp(userDto);
        return resp;
    }
}
