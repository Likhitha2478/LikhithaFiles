package org.tnsif.onlineshopping.services;
 import java.util.ArrayList;
 import org.tnsif.onlineshopping.entities.Customer;

public class CustomerService {
 private static final ArrayList<Customer> ArrayList = null;
private ArrayList<CustomerService>customerList = new ArrayList<>();
 
 public void addCustomer(CustomerService customer) {
	 customerList.add(customer);
 
 }
 //retrieve Customer by ID
 public Customer getCustomer(int userId) {
	 for (CustomerService customer : customerList) {
         if (customer.getUserId() == userId) {
             return Customer;
         }
     }
     return null;
 }
 public ArrayList<Customer> getAllCustomers() {
     return   ArrayList<CustomerList;
 }
}


 
	 
 
 