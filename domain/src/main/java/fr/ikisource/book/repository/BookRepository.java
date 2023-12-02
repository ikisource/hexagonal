package fr.ikisource.book.repository;

import fr.ikisource.book.Book;

import java.util.Optional;

public interface BookRepository {

    Book save(Book book);

    Optional<Book> findById(Long id);
}
