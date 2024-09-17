package com.sandesh.LibraryManagementSystem.repo;

import com.sandesh.LibraryManagementSystem.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
    Author saveByName(Author author);
}
