package fr.ikisource.book.persistence;

import fr.ikisource.book.Book;
import fr.ikisource.book.mapper.BookMapper;
import fr.ikisource.book.repository.BookRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PostgresBookRepository implements BookRepository {

    SpringDataJpaBookRepository springDataJpaBookRepository;

    public PostgresBookRepository(SpringDataJpaBookRepository springDataJpaBookRepository) {
        this.springDataJpaBookRepository = springDataJpaBookRepository;
    }

    @Override
    public Book save(Book book) {

        BookEntity bookEntity = springDataJpaBookRepository.save(BookMapper.toEntity(book));
        return BookMapper.toDomain(bookEntity);
    }

    @Override
    public Optional<Book> findById(Long id) {

        Optional<BookEntity> bookEntity = springDataJpaBookRepository.findById(id);
        return bookEntity.isPresent() ? Optional.of(BookMapper.toDomain(bookEntity.get())) : Optional.empty();
    }
}