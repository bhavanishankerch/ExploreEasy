package com.exploreease.hotelbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HotelBookingService {
	@Autowired
	private HotelBookingDao hotelbookingDao;
	
	@Transactional
	public void save(HotelBooking hotelbooking) {
		hotelbookingDao.save(hotelbooking);
	}
}
