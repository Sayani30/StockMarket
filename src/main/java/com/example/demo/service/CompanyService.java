package com.example.demo.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CompanyRepository;
import com.example.demo.bean.CompanyRegistration;
import com.example.demo.bean.StockDetails;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	public CompanyRegistration addCompany(CompanyRegistration companyRegistration) {
		return companyRepository.save(companyRegistration);
	}

	public List<CompanyRegistration> getAllCompanies(CompanyRegistration companyRegistrations) {
		
		//CompanyRegistration companyRegistration = new CompanyRegistration();
		//companyRegistration.setMaxStockPrice(maxStockPrice());
		//companyRegistration.setMinStockPrice(minStockPrice);
		//companyRegistration.setAvgStockPrice(avgStockPrice);
		return companyRepository.findAll();
	}
	
	public StockDetails maxStockPrice() {
		List<StockDetails> stockDetailsList = new ArrayList<>();
		return stockDetailsList.stream().max(Comparator.comparing(StockDetails::getPrice)).get();
		//return value;
	}

	public CompanyRegistration getCompanyById(int id) {
		return companyRepository.findById(id).orElse(null);
	}

	public String deleteCompanyById(int id) {
		companyRepository.deleteById(id);
		return "Company deleted";
	}

}
