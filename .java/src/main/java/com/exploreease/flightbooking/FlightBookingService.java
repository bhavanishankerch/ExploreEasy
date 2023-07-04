package com.exploreease.flightbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FlightBookingService {
	@Autowired
	private FlightBookingDao flightbookingDao;
	
	@Transactional
	public void save(FlightBooking flightbooking) {
		flightbookingDao.save(flightbooking);
	}
}
