package io.github.zdeneklach.bookstore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @ManyToOne
    @JoinColumn(name="customer_id",nullable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book Books;

    private Date orderDate;
    private int quantity;
    private double totalPrice;
}
