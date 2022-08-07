package com.example.product.controller;

import com.example.product.modal.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productrepository;
    

    @PostMapping("/addproduct")
    public String saveProduct(@RequestBody Product product) {
        productrepository.save(product);
        return "product added";
    }
    @GetMapping("/getAllProducts")
    public List<Product> getProducts(){
        return productrepository.findAll();
    }

    @GetMapping("/getProductById/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return productrepository.findById(id);
    }

    @PutMapping("/updateproduct/")
    public String updateEmployee(@RequestBody Product product) {
        productrepository.save(product);
        return "product Updated";
    }

    @DeleteMapping("/delete/{productId}")
    public String deleteEmployee(@PathVariable int productId) {
        productrepository.deleteById(productId);
        return "product deleted with id :" + productId;
    }

}

