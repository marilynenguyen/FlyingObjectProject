//--------------------------------------------------------------
// Part: 1
// Written by: Steven Lam(40226649) and Marilyne Nguyen(40228396)
//--------------------------------------------------------------


package p2;

import p0.FlyingObject;
import p1.Airplane;

/**
 * The Helicopter is a derived class from the parent class Airplane. It is composed of the 
 * attributes of each object of the class and it also contains all the methods used to create 
 * objects and that can be used on them. This class is the superclass to the Quadcopter and Multirotor
 * derived classes
 * @author stevenlam(40226649) and marilynenguyen(40228396)
 *COMP249
 *Assignment #2
 *Due Date: October 31 2022
 */

public class Helicopter extends Airplane{
	
	protected int numOfCylinders;
	protected int creationYear;
	protected int passengerCapacity;
	

	/**
	 * Default constructor for the Helicopter class to set all the variables of an Helicopter 
	 * object to default values
	 */
	public Helicopter () {
		super();
		this.numOfCylinders = 2;
		this.creationYear = 2000;
		this.passengerCapacity = 1500;
	}
	
	/**
	 * Parameterized constructor for the Helicopter class to set all the variables of an Helicopter object
	 * @param price a double value
	 * @param brand a String value
	 * @param horsePower a int value
	 * @param numOfCylinders a int value
	 * @param creationYear a int value
	 * @param passengerCapacity a int value
	 */
	public Helicopter (double price, String brand, int horsePower, int numOfCylinders, int creationYear, int passengerCapacity) {
		super(price, brand, horsePower);
		this.numOfCylinders = numOfCylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}
	
	/**
	 * Copy Constructor of the Helicopter class
	 * @param Object of Helicopter
	 */
	public Helicopter (Helicopter object) {
		this.numOfCylinders = object.numOfCylinders;
		this.creationYear = object.creationYear;
		this.passengerCapacity = object.passengerCapacity;
	}
	
	
	/**
	 * @return a int numOfCylinders of a specific Helicopter object
	 */
	public int getNumOfCylinders() {
		return this.numOfCylinders;
	}
	
	/**
	 * A method to set the input from the user to the numOfCylinders variable
	 * @param numOfCylinders int
	 */
	public void setNumOfCylinders(int numOfCylinders) {
		this.numOfCylinders = numOfCylinders;
	}
	
	/**
	 * @return a int creationYear of a specific Helicopter object
	 */
	public int getCreationYear() {
		return this.creationYear;
	}
	
	/**
	 * A method to set the input from the user to the creationYear variable
	 * @param creationYear int
	 */
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}
	
	/**
	 * @return a int passengerCapacity of a specific Helicopter object
	 */
	public int getPassengerCapacity() {
		return this.passengerCapacity;
	}
	
	/**
	 * A method to set the input from the user to the passengerCapacity variable
	 * @param passengerCapacity int
	 */
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	
	
	/**
	 * A method that returns the information of a specific Helicopter object. This method override the
	 * original toString() method from the object superclass
	 */
	public String toString() {
		return "Helicopter \nPrice: " + price + "$" + "\nBrand: " + brand + " \nHorse power: " 
	+ horsePower + " hp" + " \nNumber of cylinders: " + this.numOfCylinders + " \nYear of creation: " + this.creationYear 
	+ " \nPassenger capacity: " + this.passengerCapacity + "\n";
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
		 * if none of these conditions are respected, the method casts the object passed to Helicopter and 
		 * compares their common attributes. If their attributes is the same for both, the method returns true, if 
		 * not it return false
		 */
		if(x==null || this == null || x.getClass() != this.getClass()) {
			return false; 
		}
		else {
			
			Helicopter H = (Helicopter)x; 
			
			return (this.price == H.price 
					&& this.brand == H.brand 
					&& this.horsePower == H.horsePower 
					&& this.creationYear == H.creationYear 
					&& this.numOfCylinders == H.numOfCylinders 
					&& this.passengerCapacity == H.passengerCapacity); 
		}
		
	}
	
	
	
	

}
