//--------------------------------------------------------------
// Part: 1
// Written by: Steven Lam(40226649) and Marilyne Nguyen(40228396)
//--------------------------------------------------------------


package p0;

import p1.Airplane;
import p2.Helicopter;
import p2.Quadcopter;
import p3.Multirotor;
import p4.UAV;
import p5.AgriculturalDrone;
import p5.MAV;

public class FlyingObjectsDriverPart1 {

	public static void main(String[] args) {
		
		//Creating Airplane Object
		Airplane a1 = new Airplane();
		Airplane a2 = new Airplane(1000, "Air Canada", 10);
		Airplane a3 = new Airplane(a1);
		
		//Helicopter Airplane Object
		Helicopter h1 = new Helicopter();
		Helicopter h2 = new Helicopter(2000, "Sunsing", 20, 3, 2002, 20);
		Helicopter h3 = new Helicopter(h1);
		
		//Quadcopter Airplane Object
		Quadcopter q1 = new Quadcopter();
		Quadcopter q2 = new Quadcopter(2000, "Sunsing", 20, 3, 2002, 20, 50);
		
		//Multirotor Airplane Object
		Multirotor m1 = new Multirotor();
		Multirotor m2 = new Multirotor(5000, "Bombardier", 30, 4, 1999, 70, 10);
		
		//UAV Airplane Object
		UAV uav1 = new UAV();
		UAV uav2 = new UAV(2000, 100);
		UAV uav3 = new UAV(5000, 115);
		
		//AgriculturalDrone Airplane Object
		AgriculturalDrone ad1 = new AgriculturalDrone();
		AgriculturalDrone ad2 = new AgriculturalDrone(10000, 100, "Ouasis", 50);
		
		//MAV Airplane Object
		MAV mav1 = new MAV();
		MAV mav2 = new MAV(30000, 40, "SharkTank", 30);
		
		
		//Letting the user know that all information of all objects are going to be displayed
		System.out.println("Displaying the information of every Flying Object:\n");
		
		//Displaying the information of FlyingObject declared above
		showFlyingObjectInfo(a1);
		showFlyingObjectInfo(a2);
		showFlyingObjectInfo(a3);
		showFlyingObjectInfo(h1);
		showFlyingObjectInfo(h2);
		showFlyingObjectInfo(h3);
		showFlyingObjectInfo(q1);
		showFlyingObjectInfo(q2);
		showFlyingObjectInfo(m1);
		showFlyingObjectInfo(m2);
		showFlyingObjectInfo(uav1);
		showFlyingObjectInfo(uav2);
		showFlyingObjectInfo(mav1);
		showFlyingObjectInfo(mav2);
		
		//Message to let the user know that 2 objects from the same class are going to be compared
		System.out.println("Comparing two objects from the same class: ");
		System.out.println("-------------------------------------------");
		
		if (a1.equals(a2)) {
			System.out.println("The Airplanes (a1) & (a2) are the same");
		}
		
		else {
			System.out.println("The Airplanes (a1) & (a2) are not the same");
		}
		
		if (a1.equals(a3)) {
			System.out.println("The Airplanes (a1) & (a3) are the same");
		}
		
		else {
			System.out.println("The Airplanes (a1) & (a3) are not the same");
		}
		
		if(h1.equals(h3)) {
			System.out.println("The Helicopters (h1) & (h3) are the same");
		}
		
		else {
			System.out.println("The Helicopters (h1) & (h3) are not the same");
		}
		
		//Message to let the user know that 2 objects from the different class are going to be compared
		System.out.println("\nComparing two objects from different classes: ");
		System.out.println("-------------------------------------------");
		
		
		if(h1.equals(q1)) {
			System.out.println("The Helicopter (h1) & the quadcopter (q1) are the same");
		}
		else {
			System.out.println("The Helicopter (h1) & the quadcopter (q1) are not the same");
		}
		
		if(h2.equals(q2)) {
			System.out.println("The Helicopter (h2) & the quadcopter (q2) are the same");
		}
		
		else {
			System.out.println("The Helicopter (h2) & the quadcopter (q2) are not the same");
		}
		
		if(q2.equals(h2)) {
			System.out.println("The Helicopter (h2) & the quadcopter (q2) are the same");
		}
		
		else {
			System.out.println("The Helicopter (h2) & the quadcopter (q2) are not the same");
		}
		
		if (uav2.equals(ad2)) {
			System.out.println("The UAV (uav2) & the AgriculturalDrone (ad2) are the same");
		}
		else {
			System.out.println("The UAV (uav2) & the AgriculturalDrone (ad2) are not the same");
		}
		
		
		//Declaring a new array (objectArray1) of FlyingObject
		FlyingObject[] objectArray1 = new FlyingObject[17];
		//Declaring a new array (objectArray2) of FlyingObject
		FlyingObject[] objectArray2 = new FlyingObject[16];
		
		//Storing the elements declared above into objectArray1
		objectArray1[0] = a1;
		objectArray1[1] = a2;
		objectArray1[2] = a3;
		objectArray1[3] = h1;
		objectArray1[4] = h2;
		objectArray1[5] = h3;
		objectArray1[6] = q1;
		objectArray1[7] = q2;
		objectArray1[8] = m1;
		objectArray1[9] = m2;
		objectArray1[10] = uav1;
		objectArray1[11] = uav2;
		objectArray1[12] = ad1;
		objectArray1[13] = ad2;
		objectArray1[14] = mav1;
		objectArray1[15] = mav2;
		objectArray1[16] = uav3;
		
		//Declaring and storing FlyingObject of different classes into objectArray2. Doesn't contain any UAV object
		objectArray2[0] = new Airplane(2500, "air1", 35);
		objectArray2[1] = new Airplane(1500, "air2", 25);
		objectArray2[2] = new Airplane();
		objectArray2[3] = new Helicopter(2000, "hel1", 20, 3, 2005, 55);
		objectArray2[4] = new Helicopter();
		objectArray2[5] = new Helicopter(2000, "hel1", 20, 3, 2005, 55);
		objectArray2[6] = new Quadcopter(1750, "quad1", 33, 4, 2022, 54, 22);
		objectArray2[7] = new Quadcopter();
		objectArray2[8] = new Quadcopter(q1);
		objectArray2[9] = new Multirotor(1832, "multi1", 51, 3, 1975, 41, 4);
		objectArray2[10] = new Multirotor();
		objectArray2[11] = new Multirotor(m1);
		objectArray2[12] = new AgriculturalDrone(1325, 115, "ag1", 57);
		objectArray2[13] = new AgriculturalDrone();
		objectArray2[14] = new MAV(1247, 78, "gen5", 48);
		objectArray2[15] = new MAV();
		
		//Message to let the user know that the least and most expensive UAV object's information are going to be displayed
		System.out.println("\nDisplaying the UAV (Least and Most Expensive) : ");
		System.out.println("------------------------------------------------");
		//Message to let the user know that we're searching into objectArray1
		System.out.println("Looping through the first inventory: ");
		//Executing the findLeastAndMostExpensiveUAV with objectArray1
		findLeastAndMostExpensiveUAV(objectArray1);
		System.out.println("Looping through the second inventory: ");
		//Executing the findLeastAndMostExpensiveUAV with objectArray2
		findLeastAndMostExpensiveUAV(objectArray2);
		
		//Message to let user know that the program is going to end
		System.out.println("\nYou have reached the end of the program. The program will end");

	}
	
	
	
	public static void findLeastAndMostExpensiveUAV (FlyingObject[] x){
	
		//variable that keeps track of how many UAV objects are found within the inventory
		int uavCounter = 0;
		
		//Condition of this for loops through the array passed as an argument
		for (int i = 0 ; i < x.length ; i++) {
			//2 following lines purpose are to extract the class of each element
			String className = x[i].getClass().toString();
			className = className.substring(9);
			
			//if an UAV object is found, then increment you uavCounter variable
			if(className.equals("UAV")) {
				uavCounter++;
			}
		}
		
		//enter this branch if there was no UAV object found in the inventory
		if(uavCounter == 0) {
			//Message to let the user know that no UAV has been found
			System.out.println("\nNo UAV element has been found withing your inventory.");
		}
		//enter this branch if we find some UAV object
		else if (uavCounter > 0) {
			
			//creating a new array and its length is set to uavCounter
			UAV[] uavArray = new UAV[uavCounter];
			//declaring a new variable to store element in our uavArray
			int index1 = 0;
			
			//Condition of this for loops through the array passed as an argument
			for (int i = 0 ; i < x.length ; i++) {
				//2 following lines purpose are to extract the class of each element
				String className = x[i].getClass().toString();
				className = className.substring(9);
				
				//if an UAV object is found, then store it in uavArray at index
				if(className.equals("UAV")) {
					uavArray[index1] = (UAV)x[i];
					//everytime we store an element, we increment index1
					index1++;
				}
			}	
			
			//declaring and setting lowestPrice variable to the price of the first element of uavArray
			double lowestPrice = uavArray[0].getPrice();
			//Declaring new UAV object, named lowest and we set it by using the default constructor of UAV class
			UAV lowest = new UAV();
			
			//Condition of this for loops through uavArray
			for (int j = 0 ; j < uavArray.length ; j++) {
				//if an element has a price lower than the price of the first element, ...
				if(uavArray[j].getPrice() < lowestPrice) {
					//we update the value of the lowestPrice variable
					lowestPrice = uavArray[j].getPrice();
					//we set lowest to that new element
					lowest = uavArray[j];
				}
			}
			
			//Display the information of the UAV object with the lowest price
			System.out.println("\nThe information of the lowest price UAV are the following: " + lowest);	
			
			//declaring and setting highestPrice variable to the price of the first element of uavArray
			double highestPrice = uavArray[0].getPrice();
			//Declaring new UAV object, named highest and we set it by using the default constructor of UAV class
			UAV highest = new UAV();
			
			//Condition of this for loops through uavArray
			for (int z = 0 ; z < uavArray.length ; z++) {
				//if an element has a price greater than the price of the first element, ...
				if (uavArray[z].getPrice() > highestPrice) {
					//we update the value of the highestPrice variable
					highestPrice = uavArray[z].getPrice();
					//we set lowest to that new element
					highest = uavArray[z];
				}
			}
			
			//Message to let user know that the program is going to end
			System.out.println("\nThe information of the highest price UAV are the following: " + highest);
		}
	}
	
	
	//Method that takes as a parameter, any instance of the Object superclass
	public static void showFlyingObjectInfo (Object x) {
		//enter this branch if the object passed is an instance of the FlyingObject class
		if (x instanceof FlyingObject) {
			//Displaying all the information of the object passed
			System.out.println(x);
		}
		//enter this brand if the object passed isn't an instance of FlyingObject class
		else {
			//Message to let the user know that the object passed, isn't an instance of FlyingObject class
			System.out.println("unknow object");
		}
	}

}
