package com.exploreease.flight;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	private String flight;
	private String boarding;
	private String departure;
	private String starting_time;
	private String ending_time;
	private String duration;
	private String ticket_price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	public String getBoarding() {
		return boarding;
	}
	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getStarting_time() {
		return starting_time;
	}
	public void setStarting_time(String starting_time) {
		this.starting_time = starting_time;
	}
	public String getEnding_time() {
		return ending_time;
	}
	public void setEnding_time(String ending_time) {
		this.ending_time = ending_time;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(String ticket_price) {
		this.ticket_price = ticket_price;
	}
}
