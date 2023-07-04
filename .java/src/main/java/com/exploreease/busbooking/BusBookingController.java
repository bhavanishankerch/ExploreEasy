package com.exploreease.busbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BusBookingController {
	@Autowired
	private BusBookingService busbookingService;
	
	@PostMapping(value = "/busbooking")
	public BusBooking save(@RequestBody BusBooking busbooking) {
	    busbookingService.save(busbooking);
		return busbooking;
	}
}
