//--------------------------------------------------------------
// Part: 1
// Written by: Steven Lam(40226649) and Marilyne Nguyen(40228396)
//--------------------------------------------------------------


package p4;

import p0.FlyingObject;
import p3.Multirotor;


/**
 * The UAV is a derived class from the parent class FlyingObject. It is composed of the 
 * attributes of each object of the class and it also contains all the methods used to create 
 * objects and that can be used on them. This class is used to derive other classes.
 * @author stevenlam(40226649) and marilynenguyen(40228396)
 *COMP249
 *Assignment #2
 *Due Date: October 31 2022
 */

public class UAV extends FlyingObject {
	
	protected double weight;
	
	/**
	 * Default constructor for the UAV class to set all the variables of an UAV 
	 * object to default values
	 */
	public UAV () {
		super();
		this.weight = 200;
	}
	
	public UAV(double price) {
		super(price);
	}
	
	/**
	 * Parameterized constructor for the UAV class to set all the variables of an UAV object
	 * @param price a double value
	 * @param weight a double value
	 */
	public UAV (double price, double weight) {
		super(price);
		this.weight = weight;
	}
	
	/**
	 * Copy Constructor of the UAV class
	 * @param Object of UAV
	 */
	public UAV (UAV object) {
		setPrice(object.price);
		this.weight = object.weight;
	}

	/**
	 * @return a double weight of a specific UAV object
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * A method to set the input from the user to the weight variable
	 * @param weight double
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	/**
	 * A method that returns the information of a specific UAV object. This method override the
	 * original toString() method from the object superclass
	 */
	public String toString() {
		return "UAV \nPrice: " + price + "$" + "\nWeight: " + this.weight + "\n";
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
		 * if none of these conditions are respected, the method casts the object passed to UAV and 
		 * compares their common attributes. If their attributes is the same for both, the method returns true, if 
		 * not it return false
		 */
		if(x==null || this == null || x.getClass() != this.getClass()) {
			return false; 
		}
		else {
			
			UAV uav = (UAV)x; 
			
			return (this.price == uav.price 
					&& this.weight == uav.weight); 
		}
	}
	
	
}
