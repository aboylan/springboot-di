package com.aboylan.springboot.di.app.springbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import com.aboylan.springboot.di.app.springbootdi.models.Product;
import com.aboylan.springboot.di.app.springbootdi.repositories.ProductoRepository;

public class ProductService {

    private ProductoRepository repository = new ProductoRepository();

    public List<Product> findAll() {
        return repository.findAll().stream().map(p -> {
            Double priceImp = p.getPrice() * 1.25d;
            p.setPrice(priceImp.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }
}
