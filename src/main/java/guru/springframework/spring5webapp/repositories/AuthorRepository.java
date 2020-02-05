package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Author interface for Author repository.
 * @author Alicia Buehner
 * @version 1.0
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
