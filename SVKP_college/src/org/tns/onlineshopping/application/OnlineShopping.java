package org.tns.onlineshopping.application;
import java.util.Scanner;
import org.tnsif.onlineshopping.services.CustomerService;
import org.tnsif.onlineshopping.services.OrderService;
import org.tnsif.onlineshopping.services.AdminService;
import org.tnsif.onlineshopping.services.ProductService;
public class OnlineShopping {
private static ProductService productService = new ProductService();
private static CustomerService customerService = new CustomerService();
private static OrderService orderService = new OrderService();
private static AdminService adminService = new AdminService()

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
	System.out.println("1. Admin Menu");
	System.out.println("2. Customer Menu");
	System.out.println("3. Exit");
	System.out.println("Chosse an option:");
	int choice = scanner.nextInt();
	switch(choice ) {
	case 1: //AdminService Module
		int adminChoice;
		do {
			System.out.println("\n Admin Menu:");
			System.out.println("1. Add Product");
			System.out.println("2. Remove Product");
			System.out.println("3. View Product");
			System.out.println("4. Create Admin");
			System.out.println("5. View Admin");
			System.out.println("6. Update Order Status");
			System.out.println("7. View Orders");
			System.out.println("8. Return");
			System.out.println("Choose an option:");
			adminChoice = scanner.nextInt();
			switch (adminChoice) {
			case : 1
				addProduct(scanner);
				break;
			case : 2
				removeProduct(scanner);
				break;
			case : 3
				ViewProducts();
				break;
			case 4:
				CreateAdmin(scanner);
				break;
			case 5:
				ViewAdmins();
				break;
			case 6:
				updateOrderStatus(scanner);
				break;
			case 7:
				viewOrders();
				break;
			case 8 :
				System.out.println("Exiting Admin...");
				break ;
				default:
					System.out.println("Invalid choice! please try again.");
			}
			while(adminChoice !=8);
		}
	case 2: //Customer Module
		int customerChoice;
		do {
			System.out.println("\nCustomer menu:");
			System.out.println("1. Create Customer");
			System.out.println("2. View Customer");
			System.out.println("3. place order");
			System.out.println("4. View Orders");
			System.out.println("5. View Products");
			System.out.println("6. Return");
			System.out.println("Choose an option:");
			Scanner scanner;
			customerChoice = scanner.nextInt();
				switch(customerChoice) {
				case 1:
					Create Customer(scanner);
					break;
				case 2:
					ViewCustomers();
						break;
				case 3:
					Place Order(scanner);
					break;
				case 4: 
					View Orders(scanner);
				case 5:
					View Products();
					break;
				case 6:
					System.out.println("Exiting...");
					scanner.close();
					return;
			default:
						System.out.println("Invalid choice!please try again.");
						
		
		
	
	
private static void addProduct(Scanner scanner) {
	System.out.println("Enter product ID: ");
	int productId = scanner.nextInt();
	System.out.println("Enter product Name: ");
	String name = scanner.next();
	System.out.println("Enter product price:");
	double price = scanner.nextDouble();
	System.out.println("Enter Stock Quantity: ");
	int stockQuantity = scanner.nextInt();
	
	ProductService product = new Product (productId,name,price,stockQuantity);
	productService.addproduct(product);
	System.out.println("Product added successfully!");
}
private static void removeProduct(Scanner scanner) {
	System.out.println("Enter Product ID: ");
	int productId = scanner.nextInt();
	
	productService.removeproduct(productId);
	System.out.println("Product removed successfully!");
}
		}
	}
	


