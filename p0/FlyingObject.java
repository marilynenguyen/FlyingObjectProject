//--------------------------------------------------------------
// Part: 1
// Written by: Steven Lam(40226649) and Marilyne Nguyen(40228396)
//--------------------------------------------------------------


package p0;



/**
 * The FlyingObject class is composed of the attributes of each object of the class and
 * it also contains all the methods to create object and that can be used on them. This class
 * is the superclass to the Airplane and UAV derived classes 
 * @author stevenlam(40226649) and marilynenguyen(40228396)
 *COMP249
 *Assignment #2
 *Due Date: October 31 2022
 */

public class FlyingObject {
	
	protected double price;
	
	/**
	 * Default constructor for the FlyingObject class to set all the variables of an FlyingObject 
	 * object to default values
	 */
	public FlyingObject () {
		this.price = 6000;
	}
	
	/**
	 * Parameterized constructor for the FlyingObject class to set all the variables of an FlyingObject object
	 * @param price a double value
	 */
	public FlyingObject (double price) {
		this.price = price;
	}
	
	/**
	 * Copy Constructor of the FlyingObject class
	 * @param object of FlyingObject
	 */
	public FlyingObject (FlyingObject object) {
		this.price = object.price;
	}
	
	/**
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * A method to set a specific value to the price variable
	 * @param price double
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * A method that returns the information of a specific FyingObject object. This method override the
	 * original toString() method from the object superclass
	 */
	public String toString() {
		return "The flying object's price " + this.price + "$";
	}
	
	
	/**
	 * A method that verifies if two objects are identical by comparing the value of their variables.
	 * If they're the same return true, if not return false
	 * @param x FlyingObject object
	 * @return boolean
	 */
	public boolean equals(Object x) {
		/*
		 * condition checks is either of the object compared are null or it checks if both of these objects
		 * aren't from the same class. If one of these conditions is true, the method return false. However, 
		 * if none of these conditions are respected, the method casts the object passed to FlyingObject and 
		 * compares their common attribute. If that attribute is the same for both, the method returns true, if 
		 * not it return false
		 */
		if(x==null || this == null || x.getClass() != this.getClass()) {
			return false; 
		}
		else {
			
			FlyingObject fO = (FlyingObject)x; 
			
			return (this.price == fO.price); 
		}
	}
	
}


