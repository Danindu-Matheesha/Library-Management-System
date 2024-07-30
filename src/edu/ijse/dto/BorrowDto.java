/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author User
 */
public class BorrowDto {
    private String BorrowId;
    private String  MemberId;
    private String  BookId;
    private String BorrweDate;
    private String ReturnDate;

    public BorrowDto() {
    }

    public BorrowDto(String BorrowId, String MemberId, String BookId, String BorrweDate, String ReturnDate) {
        this.BorrowId = BorrowId;
        this.MemberId = MemberId;
        this.BookId = BookId;
        this.BorrweDate = BorrweDate;
        this.ReturnDate = ReturnDate;
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
     * @return the BookId
     */
    public String getBookId() {
        return BookId;
    }

    /**
     * @param BookId the BookId to set
     */
    public void setBookId(String BookId) {
        this.BookId = BookId;
    }

    /**
     * @return the BorrweDate
     */
    public String getBorrweDate() {
        return BorrweDate;
    }

    /**
     * @param BorrweDate the BorrweDate to set
     */
    public void setBorrweDate(String BorrweDate) {
        this.BorrweDate = BorrweDate;
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

    @Override
    public String toString() {
        return "BorrowDto{" + "BorrowId=" + BorrowId + ", MemberId=" + MemberId + ", BookId=" + BookId + ", BorrweDate=" + BorrweDate + ", ReturnDate=" + ReturnDate + '}';
    }

    
}    