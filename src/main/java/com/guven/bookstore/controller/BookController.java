package com.guven.bookstore.controller;

import com.guven.bookstore.model.Book;
import com.guven.bookstore.service.BookService;
import com.guven.bookstore.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/book")
public class BookController {

    @Autowired
    private IBookService bookService;

            @PostMapping //api/book
            public ResponseEntity<?> saveBook(@RequestBody Book book){

                return  new ResponseEntity<>(bookService.saveBook(book), HttpStatus.CREATED);

            }

            @DeleteMapping("{bookId}")
            public ResponseEntity<?> deleteBook (@PathVariable Long bookId){

                bookService.deleteBook(bookId);
                return  new ResponseEntity<>(HttpStatus.OK);
            }

            @GetMapping //api/book
            public ResponseEntity<?> getAllBooks(){
                return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
            }
}
