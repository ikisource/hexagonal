package fr.ikisource.book.controller;

import fr.ikisource.book.api.BookService;
import fr.ikisource.book.dto.BookDto;
import fr.ikisource.book.mapper.BookMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping(value = "/books", consumes = "application/json")
    void createBook(@RequestBody BookDto bookDto) {

        bookService.create(BookMapper.toDomain(bookDto));

    }
}
