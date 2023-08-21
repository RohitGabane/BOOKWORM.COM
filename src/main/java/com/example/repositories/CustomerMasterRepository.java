package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.CustomerMaster;

public interface CustomerMasterRepository extends JpaRepository<CustomerMaster, Long>{
	
}
