package fr.ikisource.book.persistence;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SpringDataBookRepository extends PagingAndSortingRepository<BookEntity, Long>, ListCrudRepository<BookEntity, Long> {

}
