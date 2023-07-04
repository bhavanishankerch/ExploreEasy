package com.exploreease.busbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BusBookingService {
	
	@Autowired
	private BusBookingDao busbookingDao;
	
	@Transactional
	public void save(BusBooking busbooking) {
		busbookingDao.save(busbooking);
		
	}

}
