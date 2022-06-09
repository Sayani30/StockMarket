package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CompanyRepository;
import com.example.demo.bean.CompanyRegistration;

@Service
public class CompanyService {
//extends MongoRepository<CompanyRegistration, String> {
	
	@Autowired
	CompanyRepository companyRepository;

	public CompanyRegistration addCompany(CompanyRegistration companyRegistration) {
		//List<CompanyRegistration> companyRegistration1 = new ArrayList<CompanyRegistration>();
		// companyRegistration1.add(companyRegistration);
		 return companyRepository.save(companyRegistration);
		
	}

	public List<CompanyRegistration> getAllCompanies() {
		return (List<CompanyRegistration>) companyRepository.findAll() ;
	}
}
