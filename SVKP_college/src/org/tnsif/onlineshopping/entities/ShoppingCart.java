package org.tnsif.onlineshopping.entities;
import java.util.HashMap;
public class ShoppingCart {
 private HashMap <Product, Integer> items;
 
 public  ShoppingCart() {
	 this.items = new HashMap<> ();
	 
 }
 //getters and setters
 public HashMap<Product,Integer>getItem() {
	 return items;
 }
 public void addItem(Product product, int quantity) {
	items.put(product, quantity);
	
 }
 public void removeItem(Product product) {
	 items.remove(product);
 }
 @Override
 public String toString() {
	 return"ShoppingCart [items=" + items + "]";
 }
	
		

	}




