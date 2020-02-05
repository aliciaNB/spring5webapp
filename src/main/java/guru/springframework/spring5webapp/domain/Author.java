package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * This class represents an Author.
 * @author Alicia Buehner
 * @version 1.0
 */
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    /**
     * Default Author constructor
     */
    public Author() {
    }

    /**
     * This constructor instantiates a new Author object with provided values.
     * @param firstName String first name
     * @param lastName String last name
     * @param books Set books Authored
     */
    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    /**
     * Gets Author Id.
     * @return Long Author id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets Author Id
     * @param id Long Author id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets Author first name.
     * @return String Author first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets Author last name.
     * @return String Author last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets Set of books for Author.
     * @return Set Authored books
     */
    public Set<Book> getBooks() {
        return books;
    }

    /**
     * Sets the Author first name
     * @param firstName Srting Authors first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the Author last name.
     * @param lastName String Authors last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the Set of books for Author.
     * @param books Set of Authored books
     */
    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
