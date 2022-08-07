package com.example.cart.controller;

import com.example.cart.modal.DeliveryAdress;
import com.example.cart.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping("/addDelivery/{cid}")
    public void addDeliveryDetails(@RequestBody DeliveryAdress deliveryadress, @PathVariable int cid){
        deliveryService.addDeliveryDetails(deliveryadress,cid);
    }

    @GetMapping("/getDeliveryDetailsById/{id}")
    public Optional<DeliveryAdress> getDeliveryDetailsById(@PathVariable int id){
        return deliveryService.getDeliveryAdressById(id);
    }
}
