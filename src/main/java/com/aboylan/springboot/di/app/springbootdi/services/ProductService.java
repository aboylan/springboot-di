package com.aboylan.springboot.di.app.springbootdi.services;

import java.util.List;

import com.aboylan.springboot.di.app.springbootdi.models.Product;

public interface ProductService {

    public List<Product> findAll();

    public Product findById(Long id);
}
