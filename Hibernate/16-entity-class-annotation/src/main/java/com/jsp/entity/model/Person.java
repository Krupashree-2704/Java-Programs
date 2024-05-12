package com.jsp.entity.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="person_information")
//name of table
public class Person {
	@Id
//	primary key annotation
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	annotation generates id automatically
	private int id;
	@Column(name = "name")
//	annotation:gives property to column created for the table in database
//	name:attribute to give column name
	private String name;
	@Column(name = "date_of_birth")
	@CreationTimestamp
//	it inserts date time stamp while we persist data first time into table
	private LocalDateTime creationofDateTime;
	@UpdateTimestamp
	private LocalDateTime updatedTimestamp;
	public LocalDateTime getUpdatedTimestamp() {
		return updatedTimestamp;
	}
	public void setUpdatedTimestamp(LocalDateTime updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}
	public Person() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getCreationofDateTime() {
		return creationofDateTime;
	}
	public void setCreationofDateTime(LocalDateTime creationofDateTime) {
		this.creationofDateTime = creationofDateTime;
	}
	

}
