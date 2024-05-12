package com.jsp.ce.oto.bi;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "mercedes")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int car_id;
	@Column(name = "carnamekeep")
	private String car_name;
	private String car_chasis;
	private double car_cost;
	@CreationTimestamp
	private LocalDateTime car_introduced;
	@UpdateTimestamp
	private LocalDateTime updated_time;
	
	public LocalDateTime getCar_introduced() {
		return car_introduced;
	}
	public void setCar_introduced(LocalDateTime car_introduced) {
		this.car_introduced = car_introduced;
	}
	public LocalDateTime getUpdated_time() {
		return updated_time;
	}
	public void setUpdated_time(LocalDateTime updated_time) {
		this.updated_time = updated_time;
	}
	@OneToOne(cascade = CascadeType.PERSIST)
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
