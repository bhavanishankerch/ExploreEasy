package com.exploreease.hotel;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HotelService {
	@Autowired
    private HotelDao hotelDao;
	
	@Transactional
	public List<Hotel> get(String city_name){
		    List<Hotel> hotels = hotelDao.get();
	        List<Hotel> filteredList = hotels.stream()
	                .filter(hotel -> hotel.getCity_name().equals(city_name))
	                .collect(Collectors.toList());
	        return filteredList;
	}

}
