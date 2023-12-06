package io.github.zdeneklach.bookstore.service;

import io.github.zdeneklach.bookstore.model.Book;
import io.github.zdeneklach.bookstore.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }
}
