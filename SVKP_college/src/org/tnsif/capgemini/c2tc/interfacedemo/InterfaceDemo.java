package org.tnsif.capgemini.c2tc.interfacedemo;

public class InterfaceDemo {


	public static void main(String[] args) {
		//you can't instantiate the interface itself
				Vehicle car=new Car();
				Vehicle bike=new Bike();
				
				
				car.start();
				car.stop();
				
				bike.start();
				bike.stop();
			
				System.out.println("Maximun speed for vehicle" +Vehicle.Max_Speed);
	   
	  
	}
 

}

