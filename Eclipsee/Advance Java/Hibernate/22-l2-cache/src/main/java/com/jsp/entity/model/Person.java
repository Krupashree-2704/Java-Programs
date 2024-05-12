package com.jsp.entity.model;

//import java.time.LocalDateTime;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.hibernate.annotations.CreationTimestamp;


@Entity
@Cacheable
//can be used above entity annotation or below entity annotation
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column (nullable = false)
	private String name;
	@Column(unique = true)
	private long mob_no;
	@Column(updatable = false)
	private boolean gender;
//	@CreationTimestamp
//	@Column(insertable = false)
//	private LocalDateTime dob;
	@Column(nullable = false,unique = true)
	private String parent_email;
	public String getParent_email() {
		return parent_email;
	}
	public void setParent_email(String parent_email) {
		this.parent_email = parent_email;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
//	public LocalDateTime getDob() {
//		return dob;
//	}
//	public void setDob(LocalDateTime dob) {
//		this.dob = dob;
//	}
	public long getMob_no() {
		return mob_no;
	}
	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
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
}
