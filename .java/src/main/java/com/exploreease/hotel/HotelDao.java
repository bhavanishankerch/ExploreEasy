package com.exploreease.hotel;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HotelDao {
	
	@Autowired
private EntityManager entityManager;
	
	public List<Hotel> get(){
		
		return entityManager.unwrap(Session.class)
				.createQuery("from Hotel", Hotel.class)
				.getResultList();
		
	} 

}
