package com.example.demo.mapper;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.example.demo.bean.CompanyRegistration;

//
@Component
public class CompanyMapper {

	public List<CompanyRegistration> toCompany(List<CompanyRegistration> companies){
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<CompanyRegistration> companyRegistrations = Arrays.asList(mapper.map(companies, CompanyRegistration.class));
		return companyRegistrations;
	}
}
