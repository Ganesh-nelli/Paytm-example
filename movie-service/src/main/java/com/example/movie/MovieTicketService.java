package com.example.movie;  // Ensure this matches the package

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // This makes it a REST controller
public class MovieTicketService {

    private int availableSeats = 20; // For simplicity, you can change this to any logic you need

    // Endpoint to check seat availability
    @GetMapping("/availability")
    public String checkAvailability() {
        return "Movie available seats: " + availableSeats;
    }

    // Endpoint to book a ticket
    @GetMapping("/book")
    public String bookTicket() {
        if (availableSeats > 0) {
            availableSeats--;  // Decrease the available seats by 1
            return "Movie ticket booked successfully!";
        } else {
            return "Sorry, no available seats for the movie.";
        }
    }
}

