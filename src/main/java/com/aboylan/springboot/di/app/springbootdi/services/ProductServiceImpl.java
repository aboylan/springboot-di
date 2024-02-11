package com.aboylan.springboot.di.app.springbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import com.aboylan.springboot.di.app.springbootdi.models.Product;
import com.aboylan.springboot.di.app.springbootdi.repositories.ProductoRepositoryImpl;

public class ProductServiceImpl implements ProductService {

    private ProductoRepositoryImpl repository = new ProductoRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return repository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.25d;
            // Product newProd = new Product(p.getId(), p.getName(), priceTax.longValue());
            Product newProd = (Product) p.clone();
            newProd.setPrice(priceTax.longValue());
            return newProd;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return repository.findById(id);
    }
}
