package com.shankar.crm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")

public class Bookings {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String customer_name;
	private String duration;
	private String car_type;

	
	public Bookings() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	@Override
	public String toString() {
		return "Bookings [id=" + id + ", customer_name=" + customer_name + ", duration=" + duration + ", car_type="
				+ car_type + "]";
	}	
	
}
