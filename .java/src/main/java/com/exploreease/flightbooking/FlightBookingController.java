package com.exploreease.flightbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FlightBookingController {
	
	@Autowired
	private FlightBookingService flightbookingService;
	
	@PostMapping(value = "/flightbooking")
	public FlightBooking save(@RequestBody FlightBooking flightbooking) {
	    flightbookingService.save(flightbooking);
		return flightbooking;
	}
}
