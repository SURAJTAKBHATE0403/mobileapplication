package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class laptop {
	@Id
	int serid;
	String brand;
	double amount;
	public laptop(int serid, String brand, double amount) {
		super();
		this.serid = serid;
		this.brand = brand;
		this.amount = amount;
	}
	public laptop() {
		super();
	}
	public int getSerid() {
		return serid;
	}
	public void setSerid(int serid) {
		this.serid = serid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "laptop [serid=" + serid + ", brand=" + brand + ", amount=" + amount + "]";
	}
	
	
}
