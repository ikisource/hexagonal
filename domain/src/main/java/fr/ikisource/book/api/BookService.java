package fr.ikisource.book.api;

import fr.ikisource.book.Book;

import java.util.Optional;

public interface BookService {

    Book create(Book book);

    Optional<Book> findById(Long id);
}
