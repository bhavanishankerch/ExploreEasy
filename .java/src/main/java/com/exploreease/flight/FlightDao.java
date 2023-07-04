package com.exploreease.flight;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FlightDao {
	@Autowired
private EntityManager entityManager;
	
	public List<Flight> get(){
		
		return entityManager.unwrap(Session.class)
				.createQuery("from Flight", Flight.class)
				.getResultList();
		
	}
	
}
