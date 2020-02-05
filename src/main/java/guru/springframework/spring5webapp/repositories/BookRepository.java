package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Book interface for Book repository.
 * @author Alicia Buehner
 * @version 1.0
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
