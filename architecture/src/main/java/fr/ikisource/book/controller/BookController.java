package fr.ikisource.book.controller;

import fr.ikisource.book.dto.BookDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @PostMapping(value = "/books", consumes = "application/json")
    void createBook(@RequestBody BookDto bookDto) {



    }
}
