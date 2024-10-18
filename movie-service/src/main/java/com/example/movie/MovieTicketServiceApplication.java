package com.example.movieticket;  // Make sure this matches your package

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Marks this as the Spring Boot main entry point
public class MovieTicketServiceApplication {

    public static void main(String[] args) {
        // This will launch the Spring Boot application
        SpringApplication.run(MovieTicketServiceApplication.class, args);
    }
}
