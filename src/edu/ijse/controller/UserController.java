/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.UserDto;
import edu.ijse.model.UserModel;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserController {
    private UserModel userModel;

    public UserController() throws Exception{
        this.userModel = new UserModel();
    }

    public String SignUp(UserDto userDto) throws Exception{
        String resp = userModel.SignUp(userDto);
        return resp;
    }
}
