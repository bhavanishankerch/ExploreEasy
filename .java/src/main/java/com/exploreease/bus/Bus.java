package com.exploreease.bus;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bus")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	private String travels_name;
	private String boarding;
	private String departure;
	private String bus_type;
	private Time starting_time;
	private Time ending_time;
	private String duration;
	private double ratings;
	private int ticket_price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTravels_name() {
		return travels_name;
	}
	public void setTravels_name(String travels_name) {
		this.travels_name = travels_name;
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
	public String getBus_type() {
		return bus_type;
	}
	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}
	public Time getStarting_time() {
		return starting_time;
	}
	public void setStarting_time(Time starting_time) {
		this.starting_time = starting_time;
	}
	public Time getEnding_time() {
		return ending_time;
	}
	public void setEnding_time(Time ending_time) {
		this.ending_time = ending_time;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public int getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(int ticket_price) {
		this.ticket_price = ticket_price;
	}
}
