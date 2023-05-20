package com.example.bdjobstest.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_information")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serialNumber;

    private String title;
    private String publisher;
    private String publicationDate;
    private int pagination;
    
    public Book() {
        
    }
    public Book(Long serialNumber, String title, String publisher, String publicationDate, int pagination) {
        super();
        this.serialNumber = serialNumber;
        this.title = title;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.pagination = pagination;
    }
    public Long getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    public int getPagination() {
        return pagination;
    }
    public void setPagination(int pagination) {
        this.pagination = pagination;
    }

    // Constructors, getters, and setters
}