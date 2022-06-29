package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
@OpenAPIDefinition(info=@Info(title = "E-Stock Market API documentation", description = "API documentation"))
public class EStockMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(EStockMarketApplication.class, args);
		
		//MongoClient client = MongoClients.create("mongodb+srv://testuser:#testuser30@cluster0.cmfztmc.mongodb.net/?retryWrites=true&w=majority");
		
	//	MongoDatabase db = client.getDatabase("sampleDB");
	//	MongoCollection col = db.getCollection("Stock");
		//Document sampleDoc = new Document();
	
	
	}

}
