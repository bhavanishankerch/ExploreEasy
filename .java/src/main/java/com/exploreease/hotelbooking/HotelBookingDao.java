package com.exploreease.hotelbooking;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HotelBookingDao {
	@Autowired
	private EntityManager entityManager;
	
	public void save(HotelBooking hotelbooking) {
		Session currentsession = entityManager.unwrap(Session.class);
		currentsession.saveOrUpdate(hotelbooking);
	}
}
