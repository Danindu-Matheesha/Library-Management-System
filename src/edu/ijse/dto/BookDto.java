/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author User
 */
public class BookDto {
    private String BookId;
    private String  Name;
    private String  Author;
    private String PublisherName;
    private String PublishedDate;
    private int Price;

    public BookDto() {
    }

    public BookDto(String BookId, String Name, String Author, String PublisherName, String PublishedDate, int Price) {
        this.BookId = BookId;
        this.Name = Name;
        this.Author = Author;
        this.PublisherName = PublisherName;
        this.PublishedDate = PublishedDate;
        this.Price = Price;
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
     * @return the Author
     */
    public String getAuthor() {
        return Author;
    }

    /**
     * @param Author the Author to set
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * @return the PublisherName
     */
    public String getPublisherName() {
        return PublisherName;
    }

    /**
     * @param PublisherName the PublisherName to set
     */
    public void setPublisherName(String PublisherName) {
        this.PublisherName = PublisherName;
    }

    /**
     * @return the PublishedDate
     */
    public String getPublishedDate() {
        return PublishedDate;
    }

    /**
     * @param PublishedDate the PublishedDate to set
     */
    public void setPublishedDate(String PublishedDate) {
        this.PublishedDate = PublishedDate;
    }

    /**
     * @return the Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "BookDto{" + "BookId=" + BookId + ", Name=" + Name + ", Author=" + Author + ", PublisherName=" + PublisherName + ", PublishedDate=" + PublishedDate + ", Price=" + Price + '}';
    }


}
