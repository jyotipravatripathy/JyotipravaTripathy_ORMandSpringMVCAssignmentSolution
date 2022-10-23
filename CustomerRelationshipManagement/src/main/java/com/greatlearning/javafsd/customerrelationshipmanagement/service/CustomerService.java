package com.greatlearning.javafsd.customerrelationshipmanagement.service;

import java.util.List;

import com.greatlearning.javafsd.customerrelationshipmanagement.entity.Customer;

public interface CustomerService {

	List<Customer> listAll();

	Customer findById(int theid);

	void save(Customer thecustomer);

	void deleteById(int theId);

}
