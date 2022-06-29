package com.example.demo.bean;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StockDetails {
	
	private double price;
	private Date startDate;
	private Date endDate;
	
	public StockDetails() {
		super();
	}

	public StockDetails(double price, Date startDate, Date endDate) {
		super();

		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
