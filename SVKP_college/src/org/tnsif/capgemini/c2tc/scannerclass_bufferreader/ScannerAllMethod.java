package org.tnsif.capgemini.c2tc.scannerclass_bufferreader;

import java.util.Scanner;

public class ScannerAllMethod {

		// import the Scanner class
		// create a scanner object
		// prompt the user for input
		// read input using scanner method
		// validate
		// close the scanner
		
		public static void main(String[] args) {

			Scanner scan=new Scanner (System.in);
			System.out.println("Enter your name");
			String name=scan.nextLine();
			
			System.out.println("Enter your age");
			int age=scan.nextInt();
			System.out.println("Enter your height");
			Float height=scan.nextFloat();
			
			System.out.println("Are you a student");
			boolean isstudent=scan.nextBoolean();
			
			System.out.println("Enter your aadhar number");
			Long aadhar = scan.nextLong();
			scan.nextLine();// 9908790291
			
			System.out.println("Enter your favorite teacher");
			String teacher= scan.nextLine();
			
			System.out.println("Enter your hobby");
	}

}
