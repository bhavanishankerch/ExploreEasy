package com.exploreease.hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HotelController {
	@Autowired
	private HotelService hotelService;
	
	@GetMapping(value = "/hoteldetails")
	public List<Hotel> get(@RequestParam("city_name") String city_name){
		return hotelService.get(city_name);
	}
}
