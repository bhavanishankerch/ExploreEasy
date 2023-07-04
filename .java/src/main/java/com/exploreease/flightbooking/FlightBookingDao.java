package com.exploreease.flightbooking;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FlightBookingDao {
	@Autowired
	private EntityManager entityManager;
	
	public void save(FlightBooking flightbooking) {
		Session currentsession = entityManager.unwrap(Session.class);
		currentsession.saveOrUpdate(flightbooking);
	}
}
