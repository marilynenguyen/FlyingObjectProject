//--------------------------------------------------------------
// Part: 1
// Written by: Steven Lam(40226649) and Marilyne Nguyen(40228396)
//--------------------------------------------------------------


package p3;

import p0.FlyingObject;
import p2.Helicopter;

/**
 * The Multirotor is a derived class from the parent class Helicopter. It is composed of the 
 * attributes of each object of the class and it also contains all the methods used to create 
 * objects and that can be used on them. For the Multirotor class, there is no class derived from it.
 * @author stevenlam(40226649) and marilynenguyen(40228396)
 *COMP249
 *Assignment #2
 *Due Date: October 31 2022
 */

public class Multirotor extends Helicopter{
	private int numOfRotors;
	
	/**
	 * Default constructor for the Multirotor class to set all the variables of an Multirotor 
	 * object to default values
	 */
	public Multirotor() {
		super();
		this.numOfRotors = 5;
	}
	
	/**
	 * Parameterized constructor for the Multirotor class to set all the variables of an Multirotor object
	 * @param price a double value
	 * @param brand a String value
	 * @param horsePower a int value
	 * @param numOfCylinders a int value
	 * @param creationYear a int value
	 * @param passengerCapacity a int value
	 * @param numOfRotors a int value
	 */
	public Multirotor (double price, String brand, int horsePower, int numOfCylinders, int creationYear, int passengerCapacity, int numOfRotors) {
		super(price, brand, horsePower, numOfCylinders, creationYear, passengerCapacity);
		this.numOfRotors = numOfRotors;
	}
	
	/**
	 * Copy Constructor of the Multirotor class
	 * @param Object of Multirotor
	 */
	public Multirotor (Multirotor object) {
		setPrice(object.price);
		setBrand(object.brand);
		setHorsePower(object.horsePower);
		setNumOfCylinders(object.getNumOfCylinders());
		setCreationYear(object.getCreationYear());
		setPassengerCapacity(object.getPassengerCapacity());
		
		this.numOfRotors = object.numOfRotors;
	}
	
	/**
	 * @return a int numOfRotors of a specific Multirotor object
	 */
	public int getNumOfRotors() {
		return numOfRotors;
	}

	/**
	 * A method to set the input from the user to the numOfRotors variable
	 * @param numOfRotors int
	 */
	public void setNumOfRotors(int numOfRotors) {
		this.numOfRotors = numOfRotors;
	}
	
	/**
	 * A method that returns the information of a specific Multirotot object. This method override the
	 * original toString() method from the object superclass
	 */
	public String toString() {
		return "Multirotor \nPrice: " + price + "$" + "\nBrand is " + brand + "\nHorse power: " 
	+ horsePower + " hp \nNumber of cylinders: " + getNumOfCylinders() + "\nYear of creation is " + getCreationYear() 
	+ "\nPassenger capacity: " + getPassengerCapacity() + "\nAmount of rotors:" + this.numOfRotors + "\n";
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
		 * if none of these conditions are respected, the method casts the object passed to Multirotor and 
		 * compares their common attributes. If their attributes is the same for both, the method returns true, if 
		 * not it return false
		 */
		if(x==null || this == null || x.getClass() != this.getClass()) {
			return false; 
		}
		
		else {
			Multirotor M = (Multirotor)x; 
			
			return (this.price == M.price
					&& this.brand == M.brand
					&& this.horsePower == M.horsePower
					&& this.getCreationYear() == M.getCreationYear()
					&& this.getNumOfCylinders() == M.getNumOfCylinders()
					&& this.getPassengerCapacity() == M.getPassengerCapacity()
					&& this.numOfRotors == M.numOfRotors); 
		}
	}
	
	
}
