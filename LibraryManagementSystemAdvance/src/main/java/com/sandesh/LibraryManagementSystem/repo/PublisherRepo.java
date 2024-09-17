package com.sandesh.LibraryManagementSystem.repo;

import com.sandesh.LibraryManagementSystem.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publisher, Integer> {
}
