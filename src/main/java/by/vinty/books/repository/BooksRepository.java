package by.vinty.books.repository;

import by.vinty.books.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface BooksRepository extends CrudRepository<Book, Long> {

    List<Book> findAllById(Long id);

}
