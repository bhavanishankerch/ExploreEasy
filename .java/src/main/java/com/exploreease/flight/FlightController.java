package com.exploreease.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FlightController {
	@Autowired
	FlightService flightService;
	
	@GetMapping(value = "/flightdetails")
	public List<Flight> get(@RequestParam("boarding") String boarding,
			@RequestParam("departure") String departure){
		return flightService.get(boarding, departure);
		
	}

}
