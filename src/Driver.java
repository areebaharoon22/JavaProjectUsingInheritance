/**
 *This program creates a superclass and 2 subclasses. It creates an arraylist of atleast 4 objects and prints them.
 *Name: Areeba Haroon
 *Instructor: Dr. Sam Shamsuddin
 *Assignment: homework 5
 *Date: 2/13/2023
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		boolean errorCheck = true;
		ArrayList<Object> obj = new ArrayList<>();
		
		
		do {
			errorCheck = false;
			try {
				System.out.println("Which object you like to create? <Please choose: 1=Services, 2=Supplies> : ");
				int decision = kb.nextInt();
				if(decision == 1) {
					boolean allowNewService = true;
					
					do {
						//String fullName, String dOB, Integer customerNum, double numberOfHours, double ratePerHour)
						kb.nextLine();
						System.out.println("Enter the customer full name: ");
						String name = kb.nextLine();
						System.out.println("Enter the customer DOB <format = ##/##/####> : ");
						String date = kb.nextLine();
						System.out.println("Enter the customer number: ");
						int custNum = kb.nextInt();
						System.out.println("Enter numbers of hours worked: ");
						double numOfHours = kb.nextDouble();
						System.out.println("Enter the rate per hour: ");
						double ratePerHour = kb.nextDouble();
						
						//loading array with new object
					
						Services object = new Services(numOfHours, ratePerHour);
						object.fullName = name;
						object.customerNum = custNum;
						object.DOB = date;
						
						obj.add(object);
						
						//checking for more then one object
						boolean error = true;
						do {
							System.out.println("Would you like to create a new object? <1=yes, 2=no> :");
							int allow = kb.nextInt();
							
							if(allow == 1) {
								error = false;
								continue;
							}else if (allow == 2){
								allowNewService = false;
								
								//print the objects
								for(int i=0; i < obj.size(); i++) {
									System.out.println("Customer :" + (i+1) + "\n" + obj.get(i).toString() + "\n");
								}
	
								error = false;
							}else {
								System.out.println("Error! Please enter only 1 or 2 value!");	
							}
						}while(error);
						
						
					}while(allowNewService);
	
					
				}
				else if (decision == 2) {
					
					boolean allowNewSupplies = true;
					
					do {
						//String fullName, String dOB, Integer customerNum, double numberOfItems, double pricePerItem
						kb.nextLine();
						System.out.println("Enter the customer full name: ");
						String name = kb.nextLine();
						System.out.println("Enter the customer DOB <format = ##/##/####> : ");
						String date = kb.nextLine();
						System.out.println("Enter the customer number: ");
						int custNum = kb.nextInt();
						System.out.println("Enter the number of items: ");
						double numOfItems = kb.nextDouble();
						System.out.println("Enter the price per item: ");
						double pricePerItem = kb.nextDouble();
						
						//loading array with new object
						Supplies object = new Supplies(numOfItems, pricePerItem);
						object.fullName = name;
						object.DOB = date;
						object.customerNum = custNum;
						
						
						obj.add(object);
						
						//checking for more then one object
						boolean error = true;
						do {
							System.out.println("Would you like to create a new object? <1=yes, 2=no> :");
							int allow = kb.nextInt();
							
							if(allow == 1) {
								error = false;
								continue;
							}else if (allow == 2){
								allowNewSupplies = false;
								
								//print the objects
								for(int i=0; i < obj.size(); i++) {
									System.out.println("Customer :" + (i+1) + "\n" + obj.get(i).toString() + "\n");
								}
								
								error = false;
							}else {
								System.out.println("Error! Please enter only 1 or 2 value!");	
							}
						}while(error);
						
					}while(allowNewSupplies);
					
					
				//catching number other than 1 or 2	
				}else {
					System.out.print("Error! Please enter either 1 or 2\n");
					errorCheck = true;
					kb.nextLine();
				}
			
			//catching invalid data type
			}catch (Exception e) {
				System.out.println("Error! wrong data type!");
				System.out.println(e);
				errorCheck = true;
				kb.nextLine();
			}
		}while(errorCheck); 

		kb.close();
	}

}
