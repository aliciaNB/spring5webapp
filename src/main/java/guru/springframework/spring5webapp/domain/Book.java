package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * This class represents a Book.
 * @author Alicia Buehner
 * @version 1.0
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String isbn;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn( name = "author_id"))
    private Set<Author> authors;

    /**
     * Default constructor for Book.
     */
    public Book() {
    }

    /**
     * This constructor instantiates a new Book object with provided values.
     * @param title String Book title
     * @param isbn String Book isbn
     * @param authors Set Book authors
     */
    public Book(String title, String isbn, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

    /**
     * Gets Book Id.
     * @return Long Book Id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets Book Id.
     * @param id Long Book id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets Book title
     * @return String Book title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets Book title
     * @param title String Book title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets Book isbn
     * @return String Book isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets Book isbn.
     * @param isbn String Book isbn.\
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Gets the Set of Book authors.
     * @return Set Book authors
     */
    public Set<Author> getAuthors() {
        return authors;
    }

    /**
     * Sets the Set of Book authors.
     * @param authors Set book Authors
     */
    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        String sb = "Book{" + "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + authors +
                '}';
        return sb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;

        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
