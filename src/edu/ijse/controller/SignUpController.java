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
    private SignUpModel signupModel;

    public SignUpController() throws Exception{
        this.signupModel = new SignUpModel();
    }

    public String SignUp(SignUpDto userDto) throws Exception{
        String resp = signupModel.SignUp(userDto);
        return resp;
    }
    
    public String updateSginup(SignUpDto signupDto) throws Exception {
        String resp = signupModel.updateSginup(signupDto);
        return resp;
    }
        
    public SignUpDto searchUser(String UserId) throws Exception{
        SignUpDto signupDto = signupModel.getUser(UserId);
        return signupDto;
    }
}
