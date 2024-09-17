package com.sandesh.LibraryManagementSystem.repo;

import com.sandesh.LibraryManagementSystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
