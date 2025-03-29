package org.tnsif.onlineshopping.entities;

public class ProductQuantityPair {

	
		private Product product;
		int quantity;
		public void productQuantitypair(Product product,int quantity) {
			this.product = product;
			this.quantity = quantity;
		}
  // getters and setters
		public Product getproduct() {
			return product;
			}
		public void setproduct(Product product) {
		 this.product = product;
		 }
		public int getQuantity()
		{
			return  quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	}
 

