package com.example.trainticket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainTicketService {

    private int availableSeats = 5; // For simplicity

    @GetMapping("/availability")
    public String checkAvailability() {
        return "Train available seats: " + availableSeats;
    }

    @GetMapping("/book")
    public String bookTicket() {
        if (availableSeats > 0) {
            availableSeats--;
            return "Train ticket booked successfully!";
        } else {
            return "Sorry, no available seats for the train.";
        }
    }
}
