package org.tnsif.onlineshopping.entities;

public class Product {
  private int productId;
  private String name;
  private double price;
  private int stockQuantity;
  
  public void product (int productId, String name, double price, int stockQuantity) {
	  this.productId = productId;
	  this.name = name;
	  this.price = price;
	  this.stockQuantity = stockQuantity;
  }
//getters and setters
  public int getProductId() {
	  return productId;
  }
  public void setProductId(int product) {
	  this.productId = productId;
  }
  public String getName() {
	  return name;
	 
  }
  public void setName(String name) {
	  this.name = name;
  }
	
  public double getPrice() {
	  return price;
  }
  public void setPrice(double price) {
	  this.price = price;
  }
  public int getStockQuantity() {
	  return stockQuantity;
  }
  public void setStockQuantity(int stockQuantity ) {
	  this.stockQuantity = stockQuantity;
  }
  
  public String toString() {
	  return "Product [productId=" + productId + ", name=" + name + ", price = " + price +", stockQuantity + "]";"
  }
 

  
		

	}


