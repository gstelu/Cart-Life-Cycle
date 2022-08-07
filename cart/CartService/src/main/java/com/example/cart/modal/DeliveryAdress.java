package com.example.cart.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="deliveryDetails")
public class DeliveryAdress {
    @Id
    private int orderId;
    private Cart cart;
    private String address;
    private Long phone;
    private String payment;
}
