package by.vinty.books.repository;

import by.vinty.books.config.RepositoryConfigurationTest;
import by.vinty.books.entity.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {RepositoryConfigurationTest.class})
public class BooksRepositoryTest {
    private BooksRepository booksRepository;

    @Autowired
    public void setBooksRepository(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Test
    public void findAllTest() {
        Book book = new Book();
        book.setName("Три Мушкетера");
        book.setAuthor("А. Дюма");
        Assert.assertNotNull(book);
        Book savedBook = booksRepository.save(book);
        List<Book> all = (List<Book>) booksRepository.findAll();
        Assert.assertNotNull(all);
        List<Book> bookList = booksRepository.findAllById(savedBook.getId());
        Assert.assertNotNull(bookList);
        System.out.println(bookList);
        booksRepository.delete(savedBook);
    }
}