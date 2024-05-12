package com.jsp.ce.bi.eliminate.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "enginedetails")
public class Engine {
	@Id
	@Column(name = "engine_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "engine_cc",nullable = false)
	private double cc;
	@Column(updatable = false)
	private byte no_of_engine;
	@CreationTimestamp
	private LocalDateTime engine_insert;
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
	public byte getNo_of_engine() {
		return no_of_engine;
	}
	public void setNo_of_engine(byte no_of_engine) {
		this.no_of_engine = no_of_engine;
	}
	public LocalDateTime getEngine_insert() {
		return engine_insert;
	}
	public void setEngine_insert(LocalDateTime engine_insert) {
		this.engine_insert = engine_insert;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
