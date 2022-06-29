package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.StockDetails;
import com.example.demo.service.StockService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/api/v1.0/market/stock")
public class StockController {
	
	@Autowired
	StockService stockservice;

	@Operation(summary = "E-StockMarket", description = "Api to add stock details details of a company")
	@ApiResponses(value = 
	{@ApiResponse(responseCode = "200", description = "Information successfully added", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "404", description = "There are no values for given input", content = @Content(mediaType = "application/json"))
			})
	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public StockDetails addStock(@RequestBody StockDetails stockDetails) {
		StockDetails addedStockDetails = stockservice.addStockDetails(stockDetails);
		return addedStockDetails;
	}
	
	@GetMapping(value = "/get/{companyCode}")
	public StockDetails getCompanyDeatils(@PathVariable int companyCode, @RequestParam(required = false) String startDate,
			@RequestParam(required=false) String endDate) {
			//@PathVariable String startDate, @PathVariable String endDate) {
		return stockservice.getComapnyDetails(companyCode);
	}

}
