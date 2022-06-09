package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.CompanyRegistration;

@Repository
public interface CompanyRepository extends MongoRepository<CompanyRegistration, String> { 

}
