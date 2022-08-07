package com.example.cart.repository;

import com.example.cart.modal.OrderCompletion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderCompletion,Integer> {
}
