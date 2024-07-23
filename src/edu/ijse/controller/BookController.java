/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.BookDto;
import edu.ijse.model.BookModel;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BookController {
     private BookModel bookModel;

    public BookController() throws Exception{
        this.bookModel = new BookModel();
    }

    public String saveBook(BookDto bookDto) throws Exception{
        String resp = bookModel.saveBook(bookDto);
        return resp;
    }

    public ArrayList<BookDto> getAllBook() throws Exception{
        ArrayList<BookDto> bookDtos = bookModel.getAllBook();
        return bookDtos;
    }

    public BookDto searchBook(String BookId) throws Exception{
        BookDto bookDto = bookModel.getBook(BookId);
        return bookDto;
    }

    public String deleteBook(String bookId) throws Exception{
        String resp = bookModel.deleteBook(bookId);
        return resp;
    }
    
    public String updateBook(BookDto bookDto) throws Exception {
        String resp = bookModel.updateBook(bookDto);
        return resp;
    }
}
