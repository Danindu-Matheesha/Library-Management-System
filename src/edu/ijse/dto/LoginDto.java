/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author User
 */
public class LoginDto {
    private String UserName;
    private String  UserPassword;

    public LoginDto() {
    }

    public LoginDto(String UserName, String UserPassword) {
        this.UserName = UserName;
        this.UserPassword = UserPassword;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the UserPassword
     */
    public String getUserPassword() {
        return UserPassword;
    }

    /**
     * @param UserPassword the UserPassword to set
     */
    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    @Override
    public String toString() {
        return "Login{" + "UserName=" + UserName + ", UserPassword=" + UserPassword + '}';
    }
    
    
}
