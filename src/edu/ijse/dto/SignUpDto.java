/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author User
 */
public class SignUpDto {
    private String Name;
    private String Password;
    private String UserId;

    public SignUpDto() {
    }

    public SignUpDto(String Name, String Password, String UserId) {
        this.Name = Name;
        this.Password = Password;
        this.UserId = UserId;
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

    /**
     * @return the MemberId
     */
    public String getUserId() {
        return UserId;
    }

    /**
     * @param UserId the MemberId to set
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    @Override
    public String toString() {
        return "SignUpDto{" + "Name=" + Name + ", Password=" + Password + ", UserId=" + UserId + '}';
    }

   
}
