package com.aboylan.springboot.di.app.springbootdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import com.aboylan.springboot.di.app.springbootdi.repositories.ProductRepository;
import com.aboylan.springboot.di.app.springbootdi.repositories.ProductoRepositoryJson;

@Configuration
@PropertySource("classpath:config.properties")
public class AppConfig {

    @Value("classpath:json/product.json")
    private Resource resource;

    @Bean("productJson")
    ProductRepository productRepositoryJson() {
        return new ProductoRepositoryJson(resource);
    }

}
