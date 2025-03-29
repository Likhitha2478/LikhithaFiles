package org.tnsif.onlineshopping.entities;

import java.util.ArrayList;
import java.util.List;
public class Customer extends User {
	private String address;
	private shoppingCart shoppingCart;
	private List<Order>orders;

	public Customer(int userId, String username, String email,String address) {
		super(userId, username, email);
		this.address = address;
		this.shoppingCart = new ShoppingCart();
		this.orders = new ArrayList<>();
		
	}
	//getters and setters
	public String getAddress() {
		return address;
		
	}
	public void setAddress(String address) {
		this.address = address;
	
	}
	public shoppingCart getshopping() {
		return shoppingCart;
	}
	public List<order> getOrders() {
		return orders;
	}
	public void addOrder(Order order) {
		orders.add(order);
	}
	
		

	}


