package fr.ikisource.book.persistence;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SpringDataJpaBookRepository extends PagingAndSortingRepository<BookEntity, Long>, ListCrudRepository<BookEntity, Long> {

}
