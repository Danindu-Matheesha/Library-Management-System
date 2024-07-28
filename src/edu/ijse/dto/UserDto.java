/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author User
 */
public class UserDto {
    private String Name;
    private String Password;
    private String ComPassword;
    private String LogName;
    private String LogPassword;
    
    public UserDto() {
    }

    public UserDto(String Name, String Password) {
        this.Name = Name;
        this.Password = Password;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "UserDto{" + "Name=" + Name + ", Password=" + Password + '}';
    }
    
    
}
