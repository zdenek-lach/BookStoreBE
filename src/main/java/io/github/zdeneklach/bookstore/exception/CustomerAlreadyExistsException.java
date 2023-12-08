package io.github.zdeneklach.bookstore.exception;

public class CustomerAlreadyExistsException extends RuntimeException {
    public CustomerAlreadyExistsException(Long customerId) {
        super("Customer with ID " + customerId + " already exists");
    }
}
