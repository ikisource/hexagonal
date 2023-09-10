package fr.ikisource.book.persistence;

import fr.ikisource.book.Book;
import fr.ikisource.book.mapper.BookMapper;
import fr.ikisource.book.repository.BookRepository;
import org.springframework.stereotype.Component;
import jakarta.transaction.Transactional;

@Component
public class PostgresBookRepository implements BookRepository {

    SpringDataBookRepository springDataBookRepository;

    public PostgresBookRepository(SpringDataBookRepository springDataBookRepository) {
        this.springDataBookRepository = springDataBookRepository;
    }

    @Override
    public Book save(Book book) {

        BookEntity bookEntity = springDataBookRepository.save(BookMapper.toEntity(book));
        return BookMapper.toDomain(bookEntity);
    }
}
