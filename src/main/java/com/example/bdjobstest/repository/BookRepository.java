package com.example.bdjobstest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bdjobstest.bean.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}