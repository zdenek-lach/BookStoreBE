package io.github.zdeneklach.bookstore.controller;

import io.github.zdeneklach.bookstore.exception.CustomerAlreadyExistsException;
import io.github.zdeneklach.bookstore.model.Customer;
import io.github.zdeneklach.bookstore.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/all")
    public List<Customer> listAllCustomers()
    {
        return customerService.getAllCustomers();
    }

    @PostMapping("/create")
    public ResponseEntity<?> createNewCustomer(@RequestBody Customer newCustomer) {
        try {
            return customerService.createCustomer(newCustomer);
        } catch (CustomerAlreadyExistsException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions, log, and return an appropriate response
            return ResponseEntity.status(500).body("Internal Server Error");
        }
    }
}
