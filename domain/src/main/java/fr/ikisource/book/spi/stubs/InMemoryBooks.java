package fr.ikisource.book.spi.stubs;

import ddd.Stub;
import fr.ikisource.book.Book;
import fr.ikisource.book.spi.Books;

import java.util.HashMap;
import java.util.Map;

@Stub
public class InMemoryBooks implements Books {

    private final Map<Long, Book> books = new HashMap<>();

    @Override
    public Book getById(Long id) {
        return books.get(id);
    }

    @Override
    public Book save(Book book) {
        return books.put(book.id(), book);
    }
}
