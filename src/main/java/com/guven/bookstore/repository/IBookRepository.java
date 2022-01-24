package com.guven.bookstore.repository;

import com.guven.bookstore.model.Book;
import com.guven.bookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IBookRepository extends JpaRepository<Book, Long> {

}
