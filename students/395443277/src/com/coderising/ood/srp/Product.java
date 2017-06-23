package com.coderising.ood.srp;

public class Product {
	protected String productID = null;
	protected String productDesc = null;

	protected void setProductID(String productID) {
		this.productID = productID;
	}

	protected String getproductID() {
		return productID;
	}

	protected void setProductDesc(String desc) {
		this.productDesc = desc;
	}
	
	protected String getProductDesc() {
		return productDesc;
	}
}
