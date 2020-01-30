package com.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junitclass.Calculation;

class CalculationTest1 {

	@Test
	void test() {
		assertEquals(3,Calculation.findMax(new int[]{1,3,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	}

}
