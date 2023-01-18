//--------------------------------------------------------------
// Part: 1
// Written by: Steven Lam(40226649) and Marilyne Nguyen(40228396)
//--------------------------------------------------------------


package p5;

import p4.UAV;

/**
 * The MAV is a derived class from the parent class UAV. It is composed of the 
 * attributes of each object of the class and it also contains all the methods used to create 
 * objects and that can be used on them. For the MAV class, there is no class derived from it.
 * @author stevenlam(40226649) and marilynenguyen(40228396)
 *COMP249
 *Assignment #2
 *Due Date: October 31 2022
 */

public class MAV extends UAV{
	
	private String model;
	private double size;
	
	/**
	 * Default constructor for the MAV class to set all the variables of an MAV 
	 * object to default values
	 */
	public MAV () {
		super();
		this.model = "MAV";
		this.size = 100.0;
	}
	
	/**
	 * Parameterized constructor for the MAV class to set all the variables of an MAV object
	 * @param price a double value
	 * @param weight a double value
	 * @param model a String value
	 * @param size a double value
	 */
	public MAV (double price, double weight, String model, double size) {
		super(price,weight);
		this.model = model;
		this.size = size;
	}
	
	/**
	 * Copy Constructor of the MAV class
	 * @param Object of MAV
	 */
	public MAV (MAV object) {
		setPrice(object.price);
		setWeight(object.weight);
		
		this.model = object.model;
		this.size = object.size;
	}
	
	
	/**
	 * @return a String model of a specific MAV object
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * A method to set the input from the user to the model variable
	 * @param model String
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * @return a double size of a specific MAV object
	 */
	public double getSize() {
		return size;
	}
	
	/**
	 * A method to set the input from the user to the size variable
	 * @param size double
	 */
	public void setSize(double size) {
		this.size = size;
	}
	
	/**
	 * A method that returns the information of a specific MAV object. This method override the
	 * original toString() method from the object superclass
	 */
	public String toString() {
		return "MAV \nPrice: " + price + "$" + "\nWeight: " + weight + " pounds \nModel: "
				+ this.model + "\nSize: " + this.size + "\n";
	}
	
	
	/**
	 * A method that verifies if two objects are identical by comparing the value of their variables.
	 * If they're the same return true, if not return false
	 * @param object FlyingObject object
	 * @return boolean
	 */
	public boolean equals(Object x) {
		/*
		 * condition checks is either of the object compared are null or it checks if both of these objects
		 * aren't from the same class. If one of these conditions is true, the method return false. However, 
		 * if none of these conditions are respected, the method casts the object passed to MAV and 
		 * compares their common attributes. If their attributes is the same for both, the method returns true, if 
		 * not it return false
		 */
		if(x==null || this == null || x.getClass() != this.getClass()) {
			return false; 
		}
		else {
			
			MAV mav = (MAV)x; 
			
			return (this.price == mav.price  
					&& this.weight == mav.weight
					&& this.model == mav.model
					&& this.size == mav.size);
		}
	}
	

}
