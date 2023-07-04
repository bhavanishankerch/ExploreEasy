package com.exploreease.flight;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FlightService {
	@Autowired
	private FlightDao flightDao;
	
	@Transactional
	public List<Flight> get(String boarding, String departure){
		List<Flight> flights = flightDao.get();
        List<Flight> filteredList = flights.stream()
                .filter(flight -> flight.getBoarding().equals(boarding) && flight.getDeparture().equals(departure))
                .collect(Collectors.toList());
        return filteredList;
	}
}
