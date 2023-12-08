package io.github.zdeneklach.bookstore.service;

import io.github.zdeneklach.bookstore.exception.CustomerAlreadyExistsException;
import io.github.zdeneklach.bookstore.model.Book;
import io.github.zdeneklach.bookstore.model.Customer;
import io.github.zdeneklach.bookstore.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@Log4j2
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    public ResponseEntity<?> createCustomer(Customer customer) {
        log.info("Attempting to save: " + customer);

        Long customerId = customer.getCustomerId();

        if (customerId == null) {
            log.warn("Customer ID is null. Proceeding without 'already exists' validation. (might cause duplicates with single different field)");
        } else if (customerRepository.existsById(customerId)) {
            log.error("Customer with ID " + customerId + " already exists!");
            throw new CustomerAlreadyExistsException(customerId);
        }
        customerRepository.save(customer);
        return ResponseEntity.ok("Customer created successfully");
    }

}
