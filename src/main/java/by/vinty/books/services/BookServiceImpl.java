package by.vinty.books.services;

import by.vinty.books.entity.Book;
import by.vinty.books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService{

    private BooksRepository booksRepository;

    @Override
    public List<Book> findAll() {
        return (List<Book>) booksRepository.findAll();
    }

    @Override
    public List<Book> findById(Long id) {
        return booksRepository.findAllById(id);
    }
}
