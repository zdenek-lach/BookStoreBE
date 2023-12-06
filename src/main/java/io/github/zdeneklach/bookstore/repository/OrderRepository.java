package io.github.zdeneklach.bookstore.repository;

import io.github.zdeneklach.bookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
