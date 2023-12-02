package fr.ikisource.book.controller;

import fr.ikisource.book.dto.BookDto;
import fr.ikisource.book.mapper.BookMapper;
import fr.ikisource.book.service.TransactionalBookService;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    private TransactionalBookService transactionalBookService;

    public BookController(TransactionalBookService transactionalBookService) {
        this.transactionalBookService = transactionalBookService;
    }

    @PostMapping(value = "/books", consumes = "application/json")
    void createBook(@RequestBody BookDto bookDto) {

        transactionalBookService.create(bookDto);
    }

    @GetMapping(value = "/books/{id}", produces = "application/json")
    BookDto getBook(@PathVariable Long id) {

        return transactionalBookService.getBook(id).orElse(null);
    }
}
