package com.junittest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.junitclass.Calculator;

public class CalculatorTest {  
	 Calculator ca=new Calculator();

	@Test
	void addtest() {
		
		int ExpectedOutput=5;
		assertEquals(ExpectedOutput,ca.add(3,2));
		
	}
	@Test
	void subtest() {
		
		int ExpectedOutput=1;
		assertEquals(ExpectedOutput,ca.sub(3,2));
		
	}
	@Test
	void multest() { 
		
		int ExpectedOutput=6;
		assertEquals(ExpectedOutput,ca.mul(3,2));
		
	}
	@Test
	void divtest() { 
		
		int ExpectedOutput=1;
		assertEquals(ExpectedOutput,ca.sub(3,2));
		
	}


}
