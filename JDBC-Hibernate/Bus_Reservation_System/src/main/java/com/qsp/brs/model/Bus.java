package com.qsp.brs.model;

public class Bus {
	private int bus_no;
	private String bus_name;
	private String bus_start_destination;
	private String bus_end_destination;
	private double bus_fare;
	public int getBus_no() {
		return bus_no;
	}
	public void setBus_no(int bus_no) {
		this.bus_no = bus_no;
	}
	public String getBus_name() {
		return bus_name;
	}
	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}
	public String getBus_start_destination() {
		return bus_start_destination;
	}
	public void setBus_start_destination(String bus_start_destination) {
		this.bus_start_destination = bus_start_destination;
	}
	public String getBus_end_destination() {
		return bus_end_destination;
	}
	public void setBus_end_destination(String bus_end_destination) {
		this.bus_end_destination = bus_end_destination;
	}
	public double getBus_fare() {
		return bus_fare;
	}
	public void setBus_fare(double bus_fare) {
		this.bus_fare = bus_fare;
	}
	
	
}
