package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.StockDetails;

@Repository
public interface StockRepository extends MongoRepository<StockDetails, Integer>{

}
