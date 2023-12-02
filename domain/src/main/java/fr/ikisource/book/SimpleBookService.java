package fr.ikisource.book;

import ddd.DomainService;
import fr.ikisource.book.api.BookService;
import fr.ikisource.book.repository.BookRepository;

import java.util.Optional;

@DomainService
public class SimpleBookService implements BookService {

    private BookRepository bookRepository;

    public SimpleBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book create(Book book) {

        return bookRepository.save(book);
    }

    @Override
    public Optional<Book> findById(Long id) {

        return bookRepository.findById(id);
    }
}
