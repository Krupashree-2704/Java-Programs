package com.jsp.ce.oto.bi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	private int car_id;
	private String car_name;
	private String car_chasis;
	private double car_cost;
	
	@OneToOne
	private Engine engine;
	public Car() {
		
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_chasis() {
		return car_chasis;
	}
	public void setCar_chasis(String car_chasis) {
		this.car_chasis = car_chasis;
	}
	public double getCar_cost() {
		return car_cost;
	}
	public void setCar_cost(double car_cost) {
		this.car_cost = car_cost;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
