package com.example.demo.bean;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StockDetails {
	
	private double price;
	
	public StockDetails() {
		super();
	}

	public StockDetails(double price) {
		super();

		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
