package io.github.zdeneklach.bookstore.controller;

import io.github.zdeneklach.bookstore.exception.OrderNotFoundException;
import io.github.zdeneklach.bookstore.model.Customer;
import io.github.zdeneklach.bookstore.model.Order;
import io.github.zdeneklach.bookstore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@CrossOrigin
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/all")
    public List<Order> listAllOrders()
    {
        return orderService.getAllOrders();
    }
    @PostMapping("/new")
    public ResponseEntity<Order> placeOrder(@RequestBody Order newOrder) {
        // Call the corresponding service method to place a new order
        Order placedOrder = orderService.placeOrder(newOrder);
        return ResponseEntity.ok(placedOrder);
    }

    @GetMapping("/get/{orderId}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long orderId) {
        try {
            Order order = orderService.getOrderById(orderId);
            return ResponseEntity.ok(order);
        } catch (OrderNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
