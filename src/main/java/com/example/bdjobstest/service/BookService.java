package com.example.bdjobstest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bdjobstest.bean.Book;
import com.example.bdjobstest.repository.BookRepository;
@Service
public class BookService {
    
    @Autowired
    public BookRepository bookRepo;
    public List<Book> getAllbooks(){
        List <Book> books = new ArrayList<>();
        bookRepo.findAll().forEach(books::add);
        return books;
    }
    public void addBook(Book book) {
       
        bookRepo.save(book);
       
    }
    public void updateBook(long serialNumber, Book book) {
      
        bookRepo.save(book);
        
    }
    public void deleteBook(long serialNumber) {
        bookRepo.deleteById(serialNumber);
        
    }
}
