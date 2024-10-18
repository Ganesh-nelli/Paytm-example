package com.example.busticket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusTicketService {

    private int availableSeats = 10; // For simplicity

    @GetMapping("/availability")
    public String checkAvailability() {
        return "Bus available seats: " + availableSeats;
    }

    @GetMapping("/book")
    public String bookTicket() {
        if (availableSeats > 0) {
            availableSeats--;
            return "Bus ticket booked successfully!";
        } else {
            return "Sorry, no available seats for the bus.";
        }
    }
}
