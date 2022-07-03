package com.example.demo.bean;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Document
public class CompanyRegistration {
	
	@Id
	private int companyCode;
	private String comapanyName;
	private String companyCEO;
	private long companyTurnover;
	private String companyWebsite;
	private String stockExchange;	
	private double maxStockPrice;
	private double minStockPrice;
	private double avgStockPrice;
	@JsonDeserialize(using = DateHandler.class)
	private Date startDate;
	private Date endDate = new Date(System.currentTimeMillis());
	private List<StockDetails> stockDetailsList;

	
	public CompanyRegistration() {
		super();
	}

	public CompanyRegistration(int companyCode, String comapanyName, String companyCEO, long companyTurnover,
			String companyWebsite, String stockExchange, double maxStockPrice, double minStockPrice,
			double avgStockPrice, Date startDate, Date endDate, List<StockDetails> stockDetailsList) {
		super();
		this.companyCode = companyCode;
		this.comapanyName = comapanyName;
		this.companyCEO = companyCEO;
		this.companyTurnover = companyTurnover;
		this.companyWebsite = companyWebsite;
		this.stockExchange = stockExchange;
		this.maxStockPrice = maxStockPrice;
		this.minStockPrice = minStockPrice;
		this.avgStockPrice = avgStockPrice;
		this.startDate = startDate;
		this.endDate = endDate;
		this.stockDetailsList = stockDetailsList;
	}

	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getComapanyName() {
		return comapanyName;
	}
	public void setComapanyName(String comapanyName) {
		this.comapanyName = comapanyName;
	}
	public String getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	public long getCompanyTurnover() {
		return companyTurnover;
	}
	public void setCompanyTurnover(long companyTurnover) {
		this.companyTurnover = companyTurnover;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public List<StockDetails> getStockDetailsList() {
		return stockDetailsList;
	}

	public void setStockDetailsList(List<StockDetails> stockDetailsList) {
		this.stockDetailsList = stockDetailsList;
	}

	public double getMaxStockPrice() {
		return maxStockPrice;
	}

	public void setMaxStockPrice(double maxStockPrice) {
		this.maxStockPrice = maxStockPrice;
	}

	public double getMinStockPrice() {
		return minStockPrice;
	}

	public void setMinStockPrice(double minStockPrice) {
		this.minStockPrice = minStockPrice;
	}

	public double getAvgStockPrice() {
		return avgStockPrice;
	}

	public void setAvgStockPrice(double avgStockPrice) {
		this.avgStockPrice = avgStockPrice;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
}
