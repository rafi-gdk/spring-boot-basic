package com.sonu.main;

import com.sonu.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.sonu.main.repository"})
@ComponentScan(basePackages = {"com.sonu.main.service", "com.sonu.main.controller", "com.sonu.main.exception"})
@EntityScan(basePackages = {"com.sonu.main.model"})

public class SpringBootBasicApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicApplication.class, args);
    }

    @Autowired
    UserService userService;

    @Override
    public void run(String... args) throws Exception {

        //userService.addUser(new UserRequest("123","Sonu",new Date(),78945613));

    }
}
