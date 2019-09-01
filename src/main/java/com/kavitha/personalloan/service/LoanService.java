package com.kavitha.personalloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kavitha.personalloan.model.Customer;
import com.kavitha.personalloan.repository.CustomerRespository;

@Component
public class LoanService {

	@Autowired
	CustomerRespository repository;

	public boolean calculate(Customer customer) {
		repository.save(customer);
		if (customer.getSalary() >= 50000) {
			return true;
		}
		return false;
	}
}
