package com.sonu.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.sonu.main.repository"})
@ComponentScan(basePackages = {"com.sonu.main.service", "com.sonu.main.controller", "com.sonu.main.exception"})
@EntityScan(basePackages = {"com.sonu.main.model"})

public class SpringBootMainClass {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainClass.class, args);

    }
}
