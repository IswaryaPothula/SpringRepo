package com.example.springJpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
    
    @Id
    int prodId;
    String prodName;
    int price;
    
}
