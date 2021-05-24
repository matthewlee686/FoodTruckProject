package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {
	
	//Main
	public static void main(String[] args) {

		FoodTruck[] foodTruck = new FoodTruck[5]; //Max Size of 5
		Scanner input = new Scanner(System.in);
		
		foodTruck.menu(foodTruck, input);
		
		
		
	}//Main
	
	//--------------------------------------------------------------------------------------------------------------------
	
	//Methods
	
	//Initial Menu
	public FoodTruck[] menu(FoodTruck[] foodTruck, Scanner input) {

		String choice;
		int option;
		

		//Title
		System.out.println("Welcome to Food Truck Finder: ");
		System.out.println("------------------\n");
	
		System.out.println("Would you like to input a review for a Food Truck?");
		choice = input.nextLine().toUpperCase();
		while(!choice.equals("YES")) {
			System.out.println("\nInvalid Choice -- Would you like to input a review for a Food Truck?");
			choice = input.nextLine().toUpperCase();
			
			//Input Validation
			if(choice.equals("NO")) {
				break;
			}
		}

		
		System.out.println("How many Food Trucks would you like to input Ratings for?");
		System.out.println("\nYou can input up to 5 Ratings");
		option = input.nextInt();
		
		if(option > 0 && option < 6) {
		
			foodTruck = foodTruckCreate(option, input);
			
		
		}//If Validation
		
		return foodTruck;
		
	}//Menu Method
	
	//Food Truck Creator
	public static FoodTruck[] foodTruckCreate(int size, Scanner input) {
		
		FoodTruck[] truck = new FoodTruck[size];
		
		for (int i = 0; i <= size; i++) {

			//Search [j]
			System.out.print("Please enter the Name: ");
			truck[i].setName(input.nextLine());
			
			System.out.print("Please enter the Type: ");
			truck[i].setType(input.nextLine());
			
			System.out.print("Please enter the Rating: ");
			truck[i].setRating(input.nextDouble());
				
			
			
			String truck_data = truck.toString(); // --------------Test Output 
			
			System.out.println("\n" + truck_data); //
			System.out.println();

		}//For
		
		return truck;
		
	}//Food Truck Creator Method
	
	//Menu 2
	public void menu2(FoodTruck[] truck, Scanner input) {
		
		String choice;
		
		do {
		System.out.println("-----------Menu-----------");
		System.out.println("1.) List available Food Trucks");
		System.out.println("2.) See the Average Rating ");
		System.out.println("3.) Show highest rated Food Trucks");
		System.out.println("4.) Quit");
		
		System.out.print("\nPlease input your choice: ");
		choice = input.nextLine();
		
		if(choice.equals("1")) {
			//List Trucks
			list(truck);
			
			} else if(choice.equals("2")) {
				//Average Rating Method
				average(truck);
				
			} else if(choice.equals("3")) {
				//Show highest rated Food Trucks
				highest_rating(truck);
				
			} else if(choice.equals("4")) {
				break;
			} else {
				System.out.println("Invalid -- Please input a valid choice: ");
			}
		
		} while(!choice.equals("4"));
		
		System.out.println("\n Thank you for using the Food Truck Finder!");
		
	}//Menu 2 Method
	
	//List
	public void list(FoodTruck[] truck) {
		
		for (int i = 0; i < truck.length; i++) {
			
			System.out.print(truck.toString());
			
		}
		
	}
	
	//Average
	public void average(FoodTruck[] truck) {
		
		double average = 0.0;
		double sum = 0.0;
		
		for(int i = 0; i < truck.length; i++) {
			sum += truck[i].getRating();
			average = sum / truck.length;
		}
		
		System.out.print(average);
	}
	
	//Highest Rating
	public void highest_rating(FoodTruck[] truck) {
		
		double largest;
		
		for(int i = 0; i < truck.length; i++) {
			
			if( truck[i] > largest) {
				largest = truck[i];
				
			}
		}
		
		System.out.print(largest);
	}
	

}//Class
