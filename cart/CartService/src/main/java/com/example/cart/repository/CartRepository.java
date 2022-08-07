package com.example.cart.repository;

import com.example.cart.modal.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart,Integer> {
}
