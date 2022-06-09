package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.CompanyRegistration;
import com.example.demo.service.CompanyService;

@RestController
@RequestMapping("/api/v1.0/market")
public class CompanyController {

	// private static final Logger LOGGER =
	// LoggerFactory.getLogger(CompanyController.class);

	@Autowired
	private CompanyService companyService;

	@PostMapping(value = "/company/register")
	public CompanyRegistration addCompany(@RequestBody CompanyRegistration companyRegistration) {
		// CompanyRegistration save = this.companyService.save(companyRegistration);
		// return ResponseEntity.ok(save);
		CompanyRegistration addedCompany = companyService.addCompany(companyRegistration);
		return addedCompany;
	}

	@GetMapping(value = "/company/getall")
	public List<CompanyRegistration> getCompanies() {
		// return ResponseEntity.ok(this.companyService.findAll());
		return companyService.getAllCompanies();
	}
}
