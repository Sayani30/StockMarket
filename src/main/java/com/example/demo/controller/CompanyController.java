package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.CompanyRegistration;
import com.example.demo.service.CompanyService;

@RestController
@RequestMapping("/api/v1.0/market")
public class CompanyController {

	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping(value = "/company/register",  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public CompanyRegistration addCompany(@RequestBody CompanyRegistration companyRegistration) {
		CompanyRegistration addedCompany = companyService.addCompany(companyRegistration);
		return addedCompany;
	}
	
	@GetMapping(value = "/company/getall")
	@ResponseStatus(HttpStatus.OK)
	public List<CompanyRegistration> getCompanies() {
		return companyService.getAllCompanies();
	}
	
	@GetMapping(value = "/company/info/{id}")
	public CompanyRegistration getCompanyById(@PathVariable int id) {
		return companyService.getCompanyById(id);
	}
	
	@DeleteMapping(value = "/company/delete/{id}")
	public void deleteCompanyById(@PathVariable int id) {
		 companyService.deleteCompanyById(id);
	}
}
