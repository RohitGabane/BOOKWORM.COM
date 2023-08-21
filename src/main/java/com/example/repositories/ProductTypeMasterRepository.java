package com.example.repositories;

import org.springframework.stereotype.Repository;


import com.example.entities.ProductTypeMaster;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
@Transactional
public interface ProductTypeMasterRepository extends JpaRepository<ProductTypeMaster,Long> {

	@Modifying
    @Query("update ProductTypeMaster p set p.typeDesc = :desc where p.typeId = :id")
    void update(@Param("desc") String typeDesc, @Param("id") Long typeId);

	
	
}