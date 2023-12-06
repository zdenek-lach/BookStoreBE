package io.github.zdeneklach.bookstore.repository;

import io.github.zdeneklach.bookstore.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
