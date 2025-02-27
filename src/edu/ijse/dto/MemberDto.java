/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author User
 */
public class MemberDto {
    private String MemberId;
    private String Name;
    private String Address;
    private int PhoneNO;
    private String DOB;
    private String RegisterDate;

    public MemberDto() {
    }

    public MemberDto(String MemberId, String Name, String Address, int PhoneNO, String DOB, String RegisterDate) {
        this.MemberId = MemberId;
        this.Name = Name;
        this.Address = Address;
        this.PhoneNO = PhoneNO;
        this.DOB = DOB;
        this.RegisterDate = RegisterDate;
    }

    /**
     * @return the MemberId
     */
    public String getMemberId() {
        return MemberId;
    }

    /**
     * @param MemberId the MemberId to set
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
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
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the PhoneNO
     */
    public int getPhoneNO() {
        return PhoneNO;
    }

    /**
     * @param PhoneNO the PhoneNO to set
     */
    public void setPhoneNO(int PhoneNO) {
        this.PhoneNO = PhoneNO;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the RegisterDate
     */
    public String getRegisterDate() {
        return RegisterDate;
    }

    /**
     * @param RegisterDate the RegisterDate to set
     */
    public void setRegisterDate(String RegisterDate) {
        this.RegisterDate = RegisterDate;
    }

    @Override
    public String toString() {
        return "MemberDto{" + "MemberId=" + MemberId + ", Name=" + Name + ", Address=" + Address + ", PhoneNO=" + PhoneNO + ", DOB=" + DOB + ", RegisterDate=" + RegisterDate + '}';
    }

    
}
