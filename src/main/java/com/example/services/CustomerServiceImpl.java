package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.CustomerMaster;
import com.example.repositories.CustomerMasterRepository;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerMasterRepository customerRepository;
	@Override
	public void addCustomer(CustomerMaster customer) {
		customerRepository.save(customer);
	}
	
}
