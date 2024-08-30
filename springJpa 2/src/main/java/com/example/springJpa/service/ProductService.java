package com.example.springJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springJpa.model.Product;
import com.example.springJpa.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
    
    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }
    
    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
