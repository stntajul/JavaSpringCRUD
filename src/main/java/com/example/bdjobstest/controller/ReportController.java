package com.example.bdjobstest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bdjobstest.repository.BookRepository;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {
    @Autowired
    private BookRepository bookRepository;

//    @GetMapping
//    public List<Book> generateReport() {
//        List<Book> books = bookRepository.findAll();
//        if (books.isEmpty()) {
//            // Return "Not found" message or throw a custom exception
//        }
//        return books;
//    }
}