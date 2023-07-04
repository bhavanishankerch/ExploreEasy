package com.exploreease.bus;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BusDao {
	
	@Autowired
	private EntityManager entityManager;
	
	public List<Bus> get(){
		
		return entityManager.unwrap(Session.class)
				.createQuery("from Bus", Bus.class)
				.getResultList();
		
	}

}
