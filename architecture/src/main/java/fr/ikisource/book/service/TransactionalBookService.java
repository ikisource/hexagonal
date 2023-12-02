package fr.ikisource.book.service;

import fr.ikisource.book.Book;
import fr.ikisource.book.api.BookService;
import fr.ikisource.book.dto.BookDto;
import fr.ikisource.book.mapper.BookMapper;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Transactional
@Service
public class TransactionalBookService {

    private BookService bookService;

    public TransactionalBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public Book create(BookDto bookDto) {
        return bookService.create(BookMapper.toDomain(bookDto));
    }

    public Optional<BookDto> getBook(Long id) {

        Optional<Book> book = bookService.findById(id);
        return book.isPresent() ? Optional.of(BookMapper.toDto(book.get())) : Optional.empty();
    }

}
