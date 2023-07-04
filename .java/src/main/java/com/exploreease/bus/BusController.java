package com.exploreease.bus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BusController {
	@Autowired
	BusService busService;
	
	@GetMapping(value = "/busdetails")
	public List<Bus> get(@RequestParam("boarding") String boarding,
			@RequestParam("departure") String departure){
		return busService.get(boarding, departure);
	}
}
