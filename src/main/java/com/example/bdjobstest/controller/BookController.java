package com.example.bdjobstest.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.example.bdjobstest.bean.Book;
import com.example.bdjobstest.repository.BookRepository;
import com.example.bdjobstest.service.BookService;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookservice = new BookService();
    @RequestMapping("/books")
    public List<Book> getAllBooks() {
        return bookservice.getAllbooks();
    }

    @RequestMapping(method= RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book) {
        bookservice.addBook(book);
    }
    @RequestMapping(method= RequestMethod.PUT, value = "/books/{serialNumber}")
    public void updateSubject(@PathVariable long serialNumber, @RequestBody Book book) {
        bookservice.updateBook(serialNumber, book);
    }
    @RequestMapping(method= RequestMethod.DELETE, value = "/books/{serialNumber}")
    public void deleteBook(@PathVariable long serialNumber) {
        bookservice.deleteBook(serialNumber);
    }


 
}