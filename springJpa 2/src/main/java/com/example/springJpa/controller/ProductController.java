package com.example.springJpa.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springJpa.model.Product;
import com.example.springJpa.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class ProductController {
    
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @PostMapping("/products")
    public void postProducts(@RequestBody Product prod) {        
        service.addProduct(prod);;
    }

    @PutMapping("/products")
    public void updateProducts(@RequestBody Product prod) {        
        service.updateProduct(prod);
    }

    @PutMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {        
        service.deleteProduct(id);
        return "Deleted successfully";
    }
    
}
