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
		return companyRepository.findAll();
	}
	

	public CompanyRegistration getCompanyById(int id) {
		return companyRepository.findById(id).orElse(null);
	}

	public String deleteCompanyById(int id) {
		companyRepository.deleteById(id);
		return "Company deleted";
	}


}
