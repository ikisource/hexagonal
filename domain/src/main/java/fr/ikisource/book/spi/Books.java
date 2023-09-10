package fr.ikisource.book.spi;

import fr.ikisource.book.Book;

public interface Books {

    Book getById(Long id);

    Book save(Book book);
}
