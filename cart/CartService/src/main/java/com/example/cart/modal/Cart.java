package com.example.cart.modal;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="Cart")
public class Cart {
    @Id
    private int cid;
    private Product product;
    private int quantity;
}
