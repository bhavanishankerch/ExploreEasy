package com.exploreease.bus;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BusService {
    @Autowired
    private BusDao busDao;

    @Transactional
    public List<Bus> get(String boarding, String departure) {
        List<Bus> buses = busDao.get();
        List<Bus> filteredList = buses.stream()
                .filter(bus -> bus.getBoarding().equals(boarding) && bus.getDeparture().equals(departure))
                .collect(Collectors.toList());
        return filteredList;
    }
}
