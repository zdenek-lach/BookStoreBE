package io.github.zdeneklach.bookstore.repository;

import io.github.zdeneklach.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Query method to find books by title
    List<Book> findByTitle(String title);

    // Query method to find books by author
    List<Book> findByAuthor(String author);

    /* bonus code
         // JPQL query to find books by genre
    @Query("SELECT b FROM Book b WHERE b.genre = :genre")
    List<Book> findByGenre(@Param("genre") String genre);
    */


}
