package io.github.zdeneklach.bookstore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId; // Updated field name for consistency
    private String title;
    private String author;
    private String genre;
    @Column(name = "release_date")
    private LocalDate releaseDate;
    private int stock;
    private double price;
}
