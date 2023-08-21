package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.ProductMaster;

@Repository
public interface IProductMasterRepository extends JpaRepository<ProductMaster, Long> {

//	@Modifying
//	@Query("update ProductMaster p ")
//	void updateById(ProductMaster product, long id);

}