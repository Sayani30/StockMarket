package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CompanyRepository;
import com.example.demo.bean.CompanyRegistration;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	public CompanyRegistration addCompany(CompanyRegistration companyRegistration) {
		return companyRepository.save(companyRegistration);
	}

	public List<CompanyRegistration> getAllCompanies() {
		
		//CompanyRegistration companyRegistration = new CompanyRegistration();
		//companyRegistration.setMaxStockPrice(maxStockPrice);
		//companyRegistration.setMaxStockPrice(maxStockPrice());
		//companyRegistration.setMinStockPrice(minStockPrice);
		//companyRegistration.setAvgStockPrice(avgStockPrice);
		return companyRepository.findAll();
	}
	
//	public CompanyRegistration maxStockPrice() {
//		List<StockDetails> stockDetailsList = new ArrayList<>();
//		for(int i=0; i<stockDetailsList.size(); i++) {
//			StockDetails stocks = new StockDetails();
//			stockDetailsList.add(stocks);
//		}
//		StockDetails value= stockDetailsList.stream().max(Comparator.comparing(StockDetails::getPrice)).get();
//		return value;
//
//	}

	public CompanyRegistration getCompanyById(int id) {
		return companyRepository.findById(id).orElse(null);
	}

	public String deleteCompanyById(int id) {
		companyRepository.deleteById(id);
		return "Company deleted";
	}


}
