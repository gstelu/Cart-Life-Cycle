package com.example.cart.service;


import com.example.cart.modal.Cart;
import com.example.cart.modal.DeliveryAdress;
import com.example.cart.repository.DeliveryAdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class DeliveryService {
    @Autowired
    private DeliveryAdressRepository deliveryadressrepository;

    @Autowired
    private RestTemplate restTemplate;


    int ordNo = 0;

    public void addDeliveryDetails(DeliveryAdress deliveryadress, int cid) {
        Cart cart = restTemplate.getForObject("http://localhost:8081/cart/getProductInCartById/" + cid, Cart.class);
        deliveryadress.setOrderId(++ordNo);
        deliveryadress.setCart(cart);
        deliveryadressrepository.save(deliveryadress);

    }
    public Optional<DeliveryAdress> getDeliveryAdressById(int id) {
        return deliveryadressrepository.findById(id);
    }
}
