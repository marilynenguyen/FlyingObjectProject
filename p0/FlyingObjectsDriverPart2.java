//--------------------------------------------------------------
// Part: 2
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

public class FlyingObjectsDriverPart2 {

	
	public static FlyingObject[] copyFlyingObjects (FlyingObject [] x) {
		
		FlyingObject[] flyingObjectArr = new FlyingObject[x.length]; 
		
		for(int i = 0; i < x.length; i++) {
			flyingObjectArr[i] = new FlyingObject(x[i]);
		}
		
		return flyingObjectArr;
		
	}
	

	public static void showFlyingObjectInfo (Object x) {
		
		if (x instanceof FlyingObject) {
			
			System.out.println(x);
		}
		else {
			System.out.println("unknow object");
		}
	}
	
	
	public static void main(String[] args) {
		
		Airplane a1 = new Airplane(10000, "Air Canada", 400); 
		Airplane a2 = new Airplane(); 
		Airplane a3 = new Airplane(20000, "Sunwing", 600); 
		
		Helicopter h1 = new Helicopter(); 
		Helicopter h2 = new Helicopter(10000,"Air Canada", 600, 6, 2002, 400); 
		Helicopter h3 = new Helicopter(h2); 
		
		Quadcopter q1 = new Quadcopter(4000, "CorsairFly", 700, 9, 2013, 400, 5000); 
		Quadcopter q2 = new Quadcopter(); 
		
		Multirotor m1 = new Multirotor(4000, "CorsairFly", 700, 9, 2013, 400, 9); 
		Multirotor m2 = new Multirotor(5000,"Multi", 800, 10, 2010, 450, 8); 
		
		UAV uav1 = new UAV(10000,5000); 
		UAV uav2 = new UAV(15000,9000); 
		
		AgriculturalDrone ad1 = new AgriculturalDrone(20000,650, "Jollibee", 30); 
		AgriculturalDrone ad2 = new AgriculturalDrone(9000,789,"Honey", 40);
		
		MAV mav1 = new MAV(6000, 760, "Kookie", 600); 
		MAV mav2 = new MAV(); 
		
		FlyingObject[] objectArray1 = new FlyingObject[16];
		
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
		
		System.out.println("Informations about the original inventory : ");
		System.out.println("-------------------------------------------");
		
		for(int i = 0 ; i < objectArray1.length; i++) {
			System.out.println(objectArray1[i]);
		}
		
		FlyingObject[] copyInventory = copyFlyingObjects(objectArray1);
		
		System.out.println("\nInformations about the copy inventory : ");
		System.out.println("---------------------------------------");
		
		for(int i = 0 ; i < copyInventory.length; i++) {
			System.out.println(copyInventory[i]);
		}
		
		System.out.println("\nYou have reached the end of the program. The program will end");
		
	}
	

}
