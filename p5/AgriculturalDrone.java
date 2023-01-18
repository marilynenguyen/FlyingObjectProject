//--------------------------------------------------------------
// Part: 1
// Written by: Steven Lam(40226649) and Marilyne Nguyen(40228396)
//--------------------------------------------------------------


package p5;

import p3.Multirotor;
import p4.UAV;

/**
 * The Multirotor is a derived class from the parent class UAV. It is composed of the 
 * attributes of each object of the class and it also contains all the methods used to create 
 * objects and that can be used on them. For the AgriculturalDrone class, there is no class derived from it.
 * @author stevenlam(40226649) and marilynenguyen(40228396)
 *COMP249
 *Assignment #2
 *Due Date: October 31 2022
 */

public class AgriculturalDrone extends UAV {
	
	private String brand;
	private int carryCapacity;
	
	/**
	 * Default constructor for the AgriculturalDrone class to set all the variables of an AgriculturalDrone 
	 * object to default values
	 */
	public AgriculturalDrone() {
		super();
		this.brand = "Samsung";
		this.carryCapacity = 500;
	}

	/**
	 * Parameterized constructor for the AgriculturalDrone class to set all the variables of an AgriculturalDrone object
	 * @param price a double value
	 * @param weight a double value
	 * @param brand a String value
	 * @param carryCapacity a int value
	 */
	public AgriculturalDrone (double price, double weight, String brand, int carryCapacity) {
		super(price, weight);
		this.brand = brand;
		this.carryCapacity = carryCapacity;
	}
	
	/**
	 * Copy Constructor of the AgriculturalDrone class
	 * @param Object of AgriculturalDrone
	 */
	public AgriculturalDrone (AgriculturalDrone object) {
		setPrice(object.price);
		setWeight(object.weight);
		
		this.brand = object.brand;
		this.carryCapacity = object.carryCapacity;
	}
	
	/**
	 * @return a String Brand of a specific AgriculturalDrone object
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * A method to set the input from the user to the brand variable
	 * @param brand String
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	

	/**
	 * A method that returns the information of a specific AgriculturalDrone object. This method override the
	 * original toString() method from the object superclass
	 */
	public String toString() {
		return "Agricultural Drone \nPrice: " + price + "$" + "\nWeight: " + weight + " pounds \nBrand: "
				+ this.brand + "\nCarrying capacity: " + this.carryCapacity + " kg\n";
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
		 * if none of these conditions are respected, the method casts the object passed to AgriculturalDrone and 
		 * compares their common attributes. If their attributes is the same for both, the method returns true, if 
		 * not it return false
		 */
		if(x==null || this == null || x.getClass() != this.getClass()) {
			return false; 
		}
		else {
			
			AgriculturalDrone ad = (AgriculturalDrone)x; 
			
			return (this.price == ad.price  
					&& this.weight == ad.weight
					&& this.brand == ad.brand
					&& this.carryCapacity == ad.carryCapacity);
		}
	}
	
	
}
