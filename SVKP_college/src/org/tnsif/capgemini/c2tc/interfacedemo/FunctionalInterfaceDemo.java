package org.tnsif.capgemini.c2tc.interfacedemo;

class GreetingImp implements FuctionalInterface1  
{

	
	public void sayHello(String name) {
		System.out.println("Hello " +name+ " !");
		
	}
	
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		GreetingImp obj=new GreetingImp();
		obj.sayHello("Leela");

	}

	
}
