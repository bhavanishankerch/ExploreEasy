package com.exploreease.busbooking;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BusBookingDao {
	@Autowired
	private EntityManager entityManager;
	
	public void save(BusBooking busbooking) {
		Session currentsession = entityManager.unwrap(Session.class);
		currentsession.saveOrUpdate(busbooking);
	}

}
