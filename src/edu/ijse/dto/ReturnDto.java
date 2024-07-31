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
    private String BorrowId;
    private String ReturnDate;// ReturanDay == TodayDate
    private Integer LateDates;
    private Integer Price;

    public ReturnDto() {
    }

    public ReturnDto(String BorrowId, String ReturnDate, Integer LateDates, Integer Price) {
        this.BorrowId = BorrowId;
        this.ReturnDate = ReturnDate;
        this.LateDates = LateDates;
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

    @Override
    public String toString() {
        return "ReturnDto{" + "BorrowId=" + BorrowId + ", ReturnDate=" + ReturnDate + ", LateDates=" + LateDates + ", Price=" + Price + '}';
    }


    
}
