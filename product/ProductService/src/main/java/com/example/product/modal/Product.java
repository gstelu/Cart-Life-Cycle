package com.example.product.modal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@ToString
@Document(collection="product")
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
    private int price;
}
