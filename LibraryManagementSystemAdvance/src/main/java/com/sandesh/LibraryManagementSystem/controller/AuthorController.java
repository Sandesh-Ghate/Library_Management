package com.sandesh.LibraryManagementSystem.controller;

import com.sandesh.LibraryManagementSystem.entity.Author;
import com.sandesh.LibraryManagementSystem.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public ResponseEntity<List<Author>> getAllAuthors() {
        List<Author> authors = authorService.getAllAuthors();
        return ResponseEntity.ok(authors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable int id) {
        Author author = authorService.getAuthorById(id);
        if (author == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(author);
    }

//    @PostMapping
//    public ResponseEntity<Author> saveAuthor(@RequestBody Author author) {
//        Author createAuthor = authorService.saveOrUpdateAuthor(author);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createAuthor);
//    }

    @PostMapping
    public ResponseEntity<Author> saveAuthorByName(@RequestBody Author author) {
        Author createAuthor = authorService.saveByName(author);
        return ResponseEntity.status(HttpStatus.CREATED).body(createAuthor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable int id, @RequestBody Author author) {
        Author exixtingAuthor = authorService.getAuthorById(id);
        if(exixtingAuthor == null) {
            return ResponseEntity.notFound().build();
        }
        author.setId(id);
        authorService.saveOrUpdateAuthor(author);
        return ResponseEntity.ok(author);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuthor(@PathVariable int id) {
        Author exixtingAuthor = authorService.getAuthorById(id);
        if(exixtingAuthor == null) {
            return ResponseEntity.notFound().build();
        }
        authorService.deleteAuthorById(id);
        return ResponseEntity.noContent().build();
    }

}
