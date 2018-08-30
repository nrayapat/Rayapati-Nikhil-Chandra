package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.CellPhone;
import com.capgemini.day6.School;
import com.capgemini.day6.Student;

class StudentTest {

	@Test
	void test() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Reshek",555,"ECE"));
		students.add(new Student("nikhil",556,"ECE"));
		students.add(new Student("madhu",557,"ECE"));
	}

}
