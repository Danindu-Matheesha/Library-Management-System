/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author User
 */
public class ReturnDto {
    private String ReturnId;
    private String ReturnDate;// ReturanDay == TodayDate
    private Integer LateDates;
    private Integer Price;
    private String BorrowId;

    public ReturnDto() {
    }

    public ReturnDto(String ReturnId, String ReturnDate, Integer LateDates, Integer Price, String BorrowId) {
        this.ReturnId = ReturnId;
        this.ReturnDate = ReturnDate;
        this.LateDates = LateDates;
        this.Price = Price;
        this.BorrowId = BorrowId;
    }

    /**
     * @return the ReturnId
     */
    public String getReturnId() {
        return ReturnId;
    }

    /**
     * @param ReturnId the ReturnId to set
     */
    public void setReturnId(String ReturnId) {
        this.ReturnId = ReturnId;
    }

    /**
     * @return the ReturnDate
     */
    public String getReturnDate() {
        return ReturnDate;
    }

    /**
     * @param ReturnDate the ReturnDate to set
     */
    public void setReturnDate(String ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    /**
     * @return the LateDates
     */
    public Integer getLateDates() {
        return LateDates;
    }

    /**
     * @param LateDates the LateDates to set
     */
    public void setLateDates(Integer LateDates) {
        this.LateDates = LateDates;
    }

    /**
     * @return the Price
     */
    public Integer getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(Integer Price) {
        this.Price = Price;
    }

    /**
     * @return the BorrowId
     */
    public String getBorrowId() {
        return BorrowId;
    }

    /**
     * @param BorrowId the BorrowId to set
     */
    public void setBorrowId(String BorrowId) {
        this.BorrowId = BorrowId;
    }

    @Override
    public String toString() {
        return "ReturnDto{" + "ReturnId=" + ReturnId + ", ReturnDate=" + ReturnDate + ", LateDates=" + LateDates + ", Price=" + Price + ", BorrowId=" + BorrowId + '}';
    }
    
}
