package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StockRepository;
import com.example.demo.bean.StockDetails;

@Service
public class StockService {
	
	@Autowired
	StockRepository stockRepository;

	public StockDetails addStockDetails(StockDetails stockDetails) {	
		return stockRepository.save(stockDetails);
	}

	public StockDetails getComapnyDetails(int companyCode) {
		return stockRepository.findById(companyCode).orElse(null);
	}


}
