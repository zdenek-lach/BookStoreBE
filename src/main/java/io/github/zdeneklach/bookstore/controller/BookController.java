package io.github.zdeneklach.bookstore.controller;

import io.github.zdeneklach.bookstore.model.Book;
import io.github.zdeneklach.bookstore.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin
public class BookController {
    private final BookService bookService;


    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/byAuthor")
    public List<Book> getBooksByAuthor(@RequestParam String author) {
        return bookService.getBooksByAuthor(author);
    }
}
