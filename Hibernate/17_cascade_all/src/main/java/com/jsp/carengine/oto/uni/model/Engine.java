package com.jsp.carengine.oto.uni.model;



import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
//@Table(name = "engine_details")
public class Engine {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double cc;
	private byte no_of_cylinders;
//	@CreationTimestamp
//	private LocalDateTime engine_introduced;
//	public LocalDateTime getEngine_introduced() {
//		return engine_introduced;
//	}
//	public void setEngine_introduced(LocalDateTime engine_introduced) {
//		this.engine_introduced = engine_introduced;
//	}
//	@OneToOne
//	private Car car;
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
//	public Car getCar() {
//		return car;
//	}
//	public void setCar(Car car) {
//		this.car = car;
//	}
	
	
}
