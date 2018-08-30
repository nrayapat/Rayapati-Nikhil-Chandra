package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class AnswerTest {

	@Test
	
		void testLaptopProducts() {
			ArrayList<Laptop> laptops = new ArrayList<>();
			
			assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
			laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
			laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
			
			assertEquals(3, laptops.size());
		}
	

   @Test
void testCar()
{
	   ArrayList<Car> Cars = new ArrayList<>();
	   assertEquals(true, Cars.add(new Car("Hyundai", "Verna", 2018, 1000000)));
		Cars.add(new Car("Volkswagon", "Polo", 2017, 9000000));
		Cars.add(new Car("Honda", "City", 2016, 1200000));
		assertEquals(3, Cars.size());
		
		
}
@Test
void testTelevision()
{
	ArrayList<Television> Televisions = new ArrayList<>();
	   assertEquals(true, Televisions.add(new Television("Sony","LED","Yes",100000.00)));
		Televisions.add(new Television("LG", "PLASMA","Yes", 80000));
		Televisions.add(new Television("BPl", "PLASMA", "No", 20000));
		assertEquals(3, Televisions.size());
		
}
	@Test
	void testCellPhone()
	{
		ArrayList<CellPhone> cellphone = new ArrayList<>();
		   assertEquals(true, cellphone.add(new CellPhone ( "iphone","x","nice","ios",100000)));
		   cellphone.add(new CellPhone("Moto","G4","bad","marshmellow",10000));
		   cellphone.add(new CellPhone("Lenevo","k5note","good","Oreo",11000));
			assertEquals(3, cellphone.size());
	
}
	
	@Test
	void testSchool()
	{
		ArrayList<School> school = new ArrayList<>();
		assertEquals(true, school.add(new School ("Nikhil","SPR","Nalgonda",10)));
		school.add(new School("Reshek","EGD","Hyderabad",1));
		school.add(new School("Madhu","KMR","GDK",5));
			assertEquals(3, school.size());
	}
		
	}
	
