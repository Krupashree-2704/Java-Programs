package com.jsp.ce.bi.eliminate.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Table(name="cardetails")
@Entity
public class Car {
	@Id
	@Column(name = "car_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "model_name",nullable = false)
	private String car_name;
	@Column(name = "car_chasis",nullable = false,unique = true)
	private String chasis;
	@CreationTimestamp
	private LocalDateTime car_inserted;
	@UpdateTimestamp
	@Column(name="date_updated")
	private LocalDateTime car_update;
	@OneToOne
	@JoinColumn(name = "engineid")
	private Engine engine;
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
	public LocalDateTime getCar_inserted() {
		return car_inserted;
	}
	public void setCar_inserted(LocalDateTime car_inserted) {
		this.car_inserted = car_inserted;
	}
	public LocalDateTime getCar_update() {
		return car_update;
	}
	public void setCar_update(LocalDateTime car_update) {
		this.car_update = car_update;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
