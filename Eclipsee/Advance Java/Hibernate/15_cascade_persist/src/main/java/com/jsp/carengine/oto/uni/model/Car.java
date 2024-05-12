package com.jsp.carengine.oto.uni.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Car {
	@Id
	private int id;
	private String car_name;
	private String chasis;
	private double cost;
//	Annotation for One to One =>@OneToOne
//	HERE FOR ANNOTATION WE HAVe attribute cascade 
//	@OneToOne(cascade=CascadeType.PERSIST)
//	@OneToOne(cascade=CascadeType.REMOVE)
//	@OneToOne(cascade=CascadeType.MERGE)
	@OneToOne(cascade=CascadeType.ALL)
//	@OneToOne(cascade=CascadeType.PERSIST)
	Engine engine;
	public Car() {
		
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
