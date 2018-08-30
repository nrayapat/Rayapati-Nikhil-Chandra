package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.NaturalOrder;



class StudentnaturalorderTest {

	@Test
	void test() {
		TreeSet<NaturalOrder> no = new TreeSet<>();
		no.add(new NaturalOrder("madhuri",1));
		no.add(new NaturalOrder("nikhil",3));
		no.add(new NaturalOrder("akhil",2));
		no.add(new NaturalOrder("meena",4));
	}

}