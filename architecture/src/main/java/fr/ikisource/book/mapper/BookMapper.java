package fr.ikisource.book.mapper;

import fr.ikisource.book.Book;
import fr.ikisource.book.dto.BookDto;
import fr.ikisource.book.persistence.BookEntity;

public class BookMapper {

    public static BookEntity toEntity(Book book) {

        BookEntity bookEntity = new BookEntity();
        bookEntity.setTitle(book.title());
        return bookEntity;
    }

    public static Book toDomain(BookEntity bookEntity) {

        return new Book(bookEntity.getId(), bookEntity.getTitle());
    }

    public static Book toDomain(BookDto bookDto) {

        return new Book(bookDto.id(), bookDto.title());
    }

    public static BookDto toDto(Book book) {

        return new BookDto(book.id(), book.title());
    }
}
