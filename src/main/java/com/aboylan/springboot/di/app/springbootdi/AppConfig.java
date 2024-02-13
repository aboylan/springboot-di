package com.aboylan.springboot.di.app.springbootdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.aboylan.springboot.di.app.springbootdi.repositories.ProductRepository;
import com.aboylan.springboot.di.app.springbootdi.repositories.ProductoRepositoryJson;

@Configuration
@PropertySource("classpath:config.properties")
public class AppConfig {

    @Bean("productJson")
    ProductRepository productRepositoryJson() {
        return new ProductoRepositoryJson();
    }

}
