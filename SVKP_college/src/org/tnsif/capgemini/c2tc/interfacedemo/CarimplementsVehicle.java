package org.tnsif.capgemini.c2tc.interfacedemo;
//implement the interface in a class
public class CarimplementsVehicle {

	 private String model;
	    
	    
	    //constructor
	          
	   public void Car(String model)
	   {
		   this.model=model;
	   }
	     
		
		
		public  void start() {
			System.out.println("Car " + model + " is starting");
		}

	
		public void stop() {
			System.out.println("Car " +model +" is stopped");
			
		}
}
