package com.virtusa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "product1")
public class Product
{
	private long pid;
	private int stock;
	private double price;
	private String pname,manufacture_date,expiry_date,manufacturing_company;
	
	public Product() 
	{
		
	}

	protected Product(long pid, int stock, double price, String pname, String manufacture_date, String expiry_date,
			String manufacturing_company) {
		super();
		this.pid = pid;
		this.stock = stock;
		this.price = price;
		this.pname = pname;
		this.manufacture_date = manufacture_date;
		this.expiry_date = expiry_date;
		this.manufacturing_company = manufacturing_company;
	}
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getManufacture_date() {
		return manufacture_date;
	}

	public void setManufacture_date(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getManufacturing_company() {
		return manufacturing_company;
	}

	public void setManufacturing_company(String manufacturing_company) {
		this.manufacturing_company = manufacturing_company;
	}
		
	

}
