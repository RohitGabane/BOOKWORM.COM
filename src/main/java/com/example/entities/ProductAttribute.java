package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodAttId;
    
    @ManyToOne
    @JoinColumn(name = "attributeId")
    private AttributeMaster attribute;
    
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductMaster product;
    
    private String attributeValue;

	public Long getProdAttId() {
		return prodAttId;
	}

	public void setProdAttId(Long prodAttId) {
		this.prodAttId = prodAttId;
	}

	public AttributeMaster getAttribute() {
		return attribute;
	}

	public void setAttribute(AttributeMaster attribute) {
		this.attribute = attribute;
	}

	public ProductMaster getProduct() {
		return product;
	}

	public void setProduct(ProductMaster product) {
		this.product = product;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
    
}