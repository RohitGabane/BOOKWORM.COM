package com.example.services;

import java.util.List;

import com.example.entities.ProductTypeMaster;

public interface IProductTypeMaster {

	List<ProductTypeMaster> getAllProducts();

	void addProductType(ProductTypeMaster pro);

	void delete(Long id);

	void update(ProductTypeMaster p, Long id);
}