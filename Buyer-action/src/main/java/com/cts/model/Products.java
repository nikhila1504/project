package com.cts.model;

public class Products {

	private int productId;
	private String productName;
	private double productPrice;
	private int subCategoryId;
	
	public Products() {
		
	}

	public Products(int productId, String productName, double productPrice, int subCategoryId) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	
		this.subCategoryId = subCategoryId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

}
