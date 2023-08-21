package com.example.services;

import org.springframework.stereotype.Service;

import com.example.entities.CustomerMaster;

public interface CustomerService {
	void addCustomer(CustomerMaster customer);
}
