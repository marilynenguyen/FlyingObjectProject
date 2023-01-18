//--------------------------------------------------------------
// Part: 1
// Written by: Steven Lam(40226649) and Marilyne Nguyen(40228396)
//--------------------------------------------------------------


package p2;

import p0.FlyingObject;

/**
 * The Quadcopter is a derived class from the parent class Helicopter. It is composed of the 
 * attributes of each object of the class and it also contains all the methods used to create 
 * objects and that can be used on them. For the Quadcopter class, there is no class derived from it.
 * @author stevenlam(40226649) and marilynenguyen(40228396)
 *COMP249
 *Assignment #2
 *Due Date: October 31 2022
 */

public class Quadcopter extends Helicopter {
	private int maxFlyingSpeed;
	
	
	/**
	 * Default constructor for the Quadcopter class to set all the variables of an Quadcopter 
	 * object to default values
	 */
	public Quadcopter () {
		super();
		this.maxFlyingSpeed = 20;
	}
	
	/**
	 * Parameterized constructor for the Quadcopter class to set all the variables of an Quadcopter object
	 * @param price a double value
	 * @param brand a String value
	 * @param horsePower a int value
	 * @param numOfCylinders a int value
	 * @param creationYear a int value
	 * @param passengerCapacity a int value
	 * @param maxFlyingSpeed a int value
	 */
	public Quadcopter (double price, String brand, int horsePower, int numOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
		super(price, brand, horsePower, numOfCylinders, creationYear, passengerCapacity);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	/**
	 * Copy Constructor of the Quadcopter class
	 * @param Object of Quadcopter
	 */
	public Quadcopter (Quadcopter object) {
		setPrice(object.price);
		setBrand(object.brand);
		setHorsePower(object.horsePower);
		setNumOfCylinders(object.numOfCylinders);
		setCreationYear(object.creationYear);
		setPassengerCapacity(object.passengerCapacity);
		
		maxFlyingSpeed = object.maxFlyingSpeed;
	}
	
	/**
	 * @return a int maxFlyingSpeed of a specific Quadcopter object
	 */
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}

	/**
	 * A method to set the input from the user to the maxFlyingSpeed variable
	 * @param maxFlyingSpeed int
	 */
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	/**
	 * A method that returns the information of a specific Quadcopter object. This method override the
	 * original toString() method from the object superclass
	 */
	public String toString() {
		return "Quadcopter \nPrice: " + price + "$" + " \nBrand: " + brand + "\nHorse power: " 
	+ horsePower + " hp \nNumber of cylinders: " + numOfCylinders + " \nYear of creation is " + creationYear 
	+ " \nPassenger capacity " + passengerCapacity + "\nMax flying speed: " + this.maxFlyingSpeed + " km/h\n";
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
		 * if none of these conditions are respected, the method casts the object passed to Quadcopter and 
		 * compares their common attributes. If their attributes is the same for both, the method returns true, if 
		 * not it return false
		 */
		if(x==null || this == null || x.getClass() != this.getClass()) {
			return false; 
		}
		else {
			
			Quadcopter Q = (Quadcopter)x; 
			
			return (this.price == Q.price 
					&& this.brand == Q.brand
					&& this.horsePower == Q.horsePower
					&& this.creationYear == Q.creationYear
					&& this.numOfCylinders == Q.getNumOfCylinders()
					&& this.passengerCapacity == Q.passengerCapacity
					&& this.maxFlyingSpeed == Q.maxFlyingSpeed); 
		}
		
	}
	
}
