package io.github.zdeneklach.bookstore.service;

import io.github.zdeneklach.bookstore.model.Book;
import io.github.zdeneklach.bookstore.model.Customer;
import io.github.zdeneklach.bookstore.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
