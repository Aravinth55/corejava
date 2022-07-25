package com.chainsys.classandmethods;

public class Cartest {

public static void testcar() {
	
	Car firstCar=new Car("TN 60 AW 9673");
     firstCar.setFuel("Petrol");
     firstCar.setYearofpurchase(2022);
     firstCar.setColor("green");
     System.out.println(firstCar.getColor());
     System.out.println(firstCar.getFuel());
     System.out.println(firstCar.getYearofpurchase());
     
}


}



