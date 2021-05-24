package com.skilldistillery.app;

public class FoodTruck {
	
	//Initialize Fields
	private int id; 
	private String name;
	private String type;
	private double rating; 
	

	//Constructor
	public FoodTruck(int id, String name, String type, double rating) {
		this.id = id++;
		this.name = name;
		this.type = type;
		this.rating = rating;
		
	}
	
	public FoodTruck() {
		
	}

	
	//Getters and Setters
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}

	
	 public String toString() {
		    String output = "Name=" + name + ", Type=" + type + ", Rating=" + rating; 
		    return output;
		  }


}//Class
