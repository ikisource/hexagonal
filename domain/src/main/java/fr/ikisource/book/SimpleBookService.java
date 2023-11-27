package fr.ikisource.book;

import ddd.DomainService;
import fr.ikisource.book.api.BookService;
import fr.ikisource.book.repository.BookRepository;
//import jakarta.transaction.Transactional;

//@Transactional
@DomainService
public class SimpleBookService implements BookService {

    BookRepository bookRepository;

    public SimpleBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book create(Book book) {

        bookRepository.save(book);

        return bookRepository.save(book);
    }
}
