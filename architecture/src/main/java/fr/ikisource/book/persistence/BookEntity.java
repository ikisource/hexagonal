package fr.ikisource.book.persistence;

import fr.ikisource.book.Book;
import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    public static BookEntity build(Book book) {

        BookEntity bookEntity = new BookEntity();
        bookEntity.setTitle(book.title());

        return bookEntity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
