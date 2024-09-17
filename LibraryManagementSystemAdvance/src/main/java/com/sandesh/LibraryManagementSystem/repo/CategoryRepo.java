package com.sandesh.LibraryManagementSystem.repo;

import com.sandesh.LibraryManagementSystem.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
