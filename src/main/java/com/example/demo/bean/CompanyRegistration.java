package com.example.demo.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "sampleCollection")
public class CompanyRegistration {

	@Id
	String companyCode;
	String comapanyName;
	String companyCEO;
	String companyTurnover;
	String companyWebsite;
	String stockExchange;

}
