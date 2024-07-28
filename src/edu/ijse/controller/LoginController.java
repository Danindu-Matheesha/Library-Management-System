/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.LoginDto;
import edu.ijse.model.LoginModel;

/**
 *
 * @author User
 */
public class LoginController {
     private LoginModel loginModel;

    public LoginController() throws Exception{
        this.loginModel = new LoginModel();
    }

    public String Login(LoginDto loginDto) throws Exception{
        String resp = loginModel.Login(loginDto);
        return resp;
    }
}
