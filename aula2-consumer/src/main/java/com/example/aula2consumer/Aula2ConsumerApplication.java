package com.example.aula2consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Aula2ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Aula2ConsumerApplication.class, args);
    }

}
