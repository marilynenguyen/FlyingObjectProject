//--------------------------------------------------------------
// Part: 1
// Written by: Steven Lam(40226649) and Marilyne Nguyen(40228396)
//--------------------------------------------------------------


package p1;


/**
 * The Airplane is a derived class from the parent class FlyingObject. It is composed of the 
 * attributes of each object of the class and it also contains all the methods used to create 
 * objects and that can be used on them. This class is the superclass to the Helicopter derived class
 * @author stevenlam(40226649) and marilynenguyen(40228396)
 *COMP249
 *Assignment #2
 *Due Date: October 31 2022
 */

import p0.FlyingObject;

public class Airplane extends FlyingObject{
	
	protected String brand;
	protected int horsePower;
	
	/**
	 * Default constructor for the Airplane class to set all the variables of an Airplane 
	 * object to default values
	 */
	public Airplane () {
		super();
		this.brand = "Air Canada";
		this.horsePower = 100;
	}
	
	/**
	 * Parameterized constructor for the Airplane class to set all the variables of an Airplane object
	 * @param price a double value
	 * @param brand a String value
	 * @param horsePower a int value
	 */
	public Airplane (double price, String brand, int horsePower) {
		super(price);
		this.brand = brand;
		this.horsePower = horsePower;
	}
	
	/**
	 * Copy Constructor of the Airplane class
	 * @param Object of Airplane
	 */
	public Airplane (Airplane object) {
		setPrice(object.price);
		this.brand = object.brand;
		this.horsePower = object.horsePower;
	}
	
	/**
	 * @return a String Brand of a specific Airplane object
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
	 * @return a int horsePower of a specific Airplane object
	 */
	public int getHorsePower() {
		return horsePower;
	}
	
	/**
	 * A method to set the input from the user to the horsePower variable
	 * @param brand String
	 */
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	/**
	 * A method that returns the information of a specific Airplane object. This method override the
	 * original toString() method from the object superclass
	 */
	public String toString() {
		return "Airplane \nPrice: " + price +  "$" + "\nBrand: " + this.brand + " \nHorse power: " 
	+ this.horsePower + " hp\n";
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
		 * if none of these conditions are respected, the method casts the object passed to Airplane and 
		 * compares their common attributes. If their attributes is the same for both, the method returns true, if 
		 * not it return false
		 */
		if(x==null || this == null ||  x.getClass() != this.getClass()) {
			return false; 
		}
		else {
			
			Airplane A = (Airplane)x; 
			
			return (this.price == A.price
					&& this.brand == A.brand 
					&& this.horsePower == A.horsePower); 
		}
		
	}
	
	
	
}


