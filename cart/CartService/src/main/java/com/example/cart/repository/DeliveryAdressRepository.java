package com.example.cart.repository;

import com.example.cart.modal.DeliveryAdress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryAdressRepository extends MongoRepository<DeliveryAdress,Integer> {
}
