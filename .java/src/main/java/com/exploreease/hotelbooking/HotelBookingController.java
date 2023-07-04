package com.exploreease.hotelbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HotelBookingController {
	@Autowired
	private HotelBookingService hotelbookingService;
	
	@PostMapping(value = "/hotelbooking")
	public HotelBooking save(@RequestBody HotelBooking hotelbooking) {
	    hotelbookingService.save(hotelbooking);
		return hotelbooking;
	}
}
