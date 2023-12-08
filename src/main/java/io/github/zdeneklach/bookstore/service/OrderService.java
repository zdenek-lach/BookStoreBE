package io.github.zdeneklach.bookstore.service;

import io.github.zdeneklach.bookstore.exception.OrderNotFoundException;
import io.github.zdeneklach.bookstore.model.Order;
import io.github.zdeneklach.bookstore.repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class OrderService {
    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    public Order placeOrder(Order order){
        return orderRepository.save(order);
    }
    public Order getOrderById(Long orderId) throws OrderNotFoundException{
        try {
            return orderRepository.findById(orderId)
                    .orElseThrow(() -> new OrderNotFoundException(orderId));
        } catch (Exception e) {
            // Handle any unexpected exceptions (optional)
            throw new OrderNotFoundException(orderId);
        }
    }

}
