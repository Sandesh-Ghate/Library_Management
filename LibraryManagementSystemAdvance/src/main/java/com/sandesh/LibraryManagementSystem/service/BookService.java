package com.sandesh.LibraryManagementSystem.service;

import com.sandesh.LibraryManagementSystem.entity.Book;
import com.sandesh.LibraryManagementSystem.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book getBookById(int id) {
        return bookRepo.findById(id).orElse(null);
    }

    public Book saveOrUpdateBook(Book book) {
        return bookRepo.save(book);
    }

    public void deleteBookById(int id) {
        bookRepo.findById(id).orElse(null);
        bookRepo.deleteById(id);
    }
}
