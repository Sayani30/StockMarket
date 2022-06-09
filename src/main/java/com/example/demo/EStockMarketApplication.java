package com.example.demo;

import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class EStockMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(EStockMarketApplication.class, args);
		
		//System.out.println("Hello wrold");
		MongoClient client = MongoClients.create("mongodb+srv://testuser:#testuser30@e-stockmarket.c8bapwh.mongodb.net/?retryWrites=true&w=majority");
		
		MongoDatabase db = client.getDatabase("sampleDB");
		MongoCollection col = db.getCollection("sampleCollection");
		Document sampleDoc = new Document();
	
	
	}

}
