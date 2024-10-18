package com.example.movieticket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieTicketService {

    private int availableSeats = 20; // For simplicity

    @GetMapping("/availability")
    public String checkAvailability() {
        return "Movie available seats: " + availableSeats;
    }

    @GetMapping("/book")
    public String bookTicket() {
        if (availableSeats > 0) {
            availableSeats--;
            return "Movie ticket booked successfully!";
        } else {
            return "Sorry, no available seats for the movie.";
        }
    }
}
