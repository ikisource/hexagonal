package fr.ikisource.book;

import fr.ikisource.book.spi.Books;
import fr.ikisource.book.spi.stubs.InMemoryBooks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceTest {

    @Test
    void create() {

        Books books = new InMemoryBooks();
        Book book = new Book(1L, "La route du temps");

        books.save(book);

        Book createdBook = books.getById(book.id());
        System.out.println("createdBook = " + createdBook);
        assertEquals(book, createdBook);
    }
}
