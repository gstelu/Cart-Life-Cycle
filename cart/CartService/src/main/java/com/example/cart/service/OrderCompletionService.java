package com.example.cart.service;


import com.example.cart.modal.DeliveryAdress;
import com.example.cart.modal.OrderCompletion;
import com.example.cart.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderCompletionService {
    @Autowired
    private OrderRepository orderrepository;
    @Autowired
    private RestTemplate restTemplate;
    int poId=0;
    public void validateAndPlaceOrder(int oid) {
        DeliveryAdress deliveryadress=restTemplate.getForObject("http://localhost:8081/delivery/getDeliveryDetailsById/"+ oid ,DeliveryAdress.class);
        if(deliveryadress.getPayment().equals("COD")  && !(deliveryadress.getAddress().isBlank())){
            OrderCompletion ordercompletion = new OrderCompletion();
            ordercompletion.setPlacedId(++poId);
            ordercompletion.setDeliveryadress(deliveryadress);
            orderrepository.save(ordercompletion);
        }
    }

    public List<OrderCompletion> getAllPlacedOrders() {
        return orderrepository.findAll();
    }
}
