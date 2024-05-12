package com.jsp.ce.oto.bi.eliminateduplicate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {
	@Id
	private int id;
	private double cc;
	private byte no_of_cylinders;
	@OneToOne(mappedBy = "engine")
	private Car car;
	public Engine() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	public byte getNo_of_cylinders() {
		return no_of_cylinders;
	}
	public void setNo_of_cylinders(byte no_of_cylinders) {
		this.no_of_cylinders = no_of_cylinders;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
