package org.tnsif.capgemini.c2tc.interfacedemo;
public class BikeimplementsVehicle {
  

	 private String type;
	     
	     public void Bike(String type)
	     {
	    	 this.type=type;
	     }
	     public void start() {
			
			System.out.println("Bike " + type + " is starting");
		}
             public void stop() {
			
			System.out.println("Bike " + type+ " is stopping");
		
		

	}

}
