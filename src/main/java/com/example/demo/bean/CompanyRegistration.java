package com.example.demo.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CompanyRegistration {
	
	@Id
	private int companyCode;
	private String comapanyName;
	private String companyCEO;
	private long companyTurnover;
	private String companyWebsite;
	private String stockExchange;	
	private StockDetails maxStockPrice;
	private StockDetails minStockPrice;
	private StockDetails avgStockPrice;
	private List<StockDetails> stockDetailsList;

	
	public CompanyRegistration() {
		super();
	}

	public CompanyRegistration(int companyCode, String comapanyName, String companyCEO, long companyTurnover,
			String companyWebsite, String stockExchange, List<StockDetails> stockDetailsList,
			StockDetails maxStockPrice, StockDetails minStockPrice, StockDetails avgStockPrice) {
		super();
		this.companyCode = companyCode;
		this.comapanyName = comapanyName;
		this.companyCEO = companyCEO;
		this.companyTurnover = companyTurnover;
		this.companyWebsite = companyWebsite;
		this.stockExchange = stockExchange;
		this.stockDetailsList = stockDetailsList;
		this.maxStockPrice = maxStockPrice;
		this.minStockPrice = minStockPrice;
		this.avgStockPrice = avgStockPrice;
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

	public StockDetails getMaxStockPrice() {
		return maxStockPrice;
	}

	public void setMaxStockPrice(StockDetails maxStockPrice) {
		this.maxStockPrice = maxStockPrice;
	}

	public StockDetails getMinStockPrice() {
		return minStockPrice;
	}

	public void setMinStockPrice(StockDetails minStockPrice) {
		this.minStockPrice = minStockPrice;
	}

	public StockDetails getAvgStockPrice() {
		return avgStockPrice;
	}

	public void setAvgStockPrice(StockDetails avgStockPrice) {
		this.avgStockPrice = avgStockPrice;
	}

	
}
