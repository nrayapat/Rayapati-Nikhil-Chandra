package com.cg.day5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.day5.CountryNotValidException;
import com.cg.day5.EmployeeNameInvalidException;
import com.cg.day5.TaxCalculator;
import com.cg.day5.TaxNotEligibleException;


class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInputs() throws Exception 
	{
		assertEquals(16000,TaxCalculator.calculateTax("Nikhil Chandra", true, 200000),1);	
	}
	
	void testValidCountry() {
		assertThrows(CountryNotValidException.class, ()-> TaxCalculator.calculateTax("Nikhil Chandra", false, 55000));
	}
	
	void testValidName() {
		assertThrows(EmployeeNameInvalidException .class, ()-> TaxCalculator.calculateTax("", true, 55000));
	}
	
	void testTaxEligibility() {
		assertThrows(EmployeeNameInvalidException .class, ()-> TaxCalculator.calculateTax("Nikhil Chandra", true, 1000));
	}
}
