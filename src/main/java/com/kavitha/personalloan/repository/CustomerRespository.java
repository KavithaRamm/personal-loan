package com.kavitha.personalloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kavitha.personalloan.model.Customer;

@Repository
public interface CustomerRespository extends JpaRepository<Customer, Integer> {

}
