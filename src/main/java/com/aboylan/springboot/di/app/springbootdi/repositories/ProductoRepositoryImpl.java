package com.aboylan.springboot.di.app.springbootdi.repositories;

import java.util.Arrays;
import java.util.List;

import com.aboylan.springboot.di.app.springbootdi.models.Product;

public class ProductoRepositoryImpl implements ProductRepository {

    private List<Product> data;

    public ProductoRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria Corsair 32", 300L),
                new Product(2L, "CPU Intel Core i9", 850L),
                new Product(3L, "Teclado Rezer Mini 60%", 180L),
                new Product(4L, "Motherboard Gigabyte", 409L));
    }

    @Override
    public List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}