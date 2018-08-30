package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class AnswerTest2 {

	@Test
	void testLaptopProducts() {
		HashSet<Laptop> laptops = new HashSet<>();
		
		assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
		assertEquals(true, laptops.add(new Laptop("HP", "HP234", "Windows 5", "i3")));
		assertEquals(true, laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7")));
		assertEquals(false, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 7", "i5")));
		
		
		assertEquals(3, laptops.size());
	}
	 @Test
	 void testCar()
	 {
	 	   HashSet<Car> Cars = new HashSet<>();
	 	   assertEquals(true, Cars.add(new Car("Hyundai", "Verna", 2018, 1000000)));
	 	  assertEquals(true, Cars.add(new Car("Volkswagon", "Polo", 2017, 9000000)));
	 	 assertEquals(true, Cars.add(new Car("Honda", "City", 2016, 1200000)));
	 	assertEquals(false, Cars.add(new Car("Hyundai", "Verna", 2017, 1000000)));
	 		
	 		assertEquals(3, Cars.size());
	 		
	 		
	 }
	 @Test
	 void testTelevision()
	 {
	 	HashSet<Television> Televisions = new HashSet<>();
	 	   assertEquals(true, Televisions.add(new Television("Sony","LED","Yes",100000.00)));
	 	  assertEquals(true, Televisions.add(new Television("LG", "PLASMA","Yes", 80000)));
	 	 assertEquals(true, Televisions.add(new Television("BPl", "PLASMA", "No", 20000)));
	 	assertEquals(false, Televisions.add(new Television("Sony","LED","Yes",100001.00)));
	 		
	 		assertEquals(3, Televisions.size());
	 }
	 @Test
		void testCellPhone()
		{
			HashSet<CellPhone> cellphone = new HashSet<>();
			   assertEquals(true, cellphone.add(new CellPhone ( "iphone","x","nice","ios",100000)));
			   assertEquals(true, cellphone.add(new CellPhone ("Moto","G4","bad","marshmellow",10000)));
			   assertEquals(true, cellphone.add(new CellPhone ( "Lenevo","k5note","good","Oreo",11000)));
			   assertEquals(false, cellphone.add(new CellPhone ( "iphone","x","nice","os",100001)));
			   
				assertEquals(3, cellphone.size());
		}
		@Test
		void testSchool()
		{
			HashSet<School> school = new HashSet<>();
			assertEquals(true, school.add(new School ("Nikhil","SPR","Nalgonda",10)));
			assertEquals(true, school.add(new School ("Reshek","EGD","Hyderabad",1)));
			assertEquals(true, school.add(new School ("Madhu","KMR","GDK",5)));
			assertEquals(false, school.add(new School ("Nikhil","SPR","Nalgonda",2)));
			
				assertEquals(3, school.size());
		}
			
		}
		
		
	 		
