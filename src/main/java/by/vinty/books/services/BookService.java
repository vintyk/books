package by.vinty.books.services;

import by.vinty.books.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    List<Book> findById(Long id);
}
