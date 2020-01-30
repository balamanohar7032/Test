package com.junitclass;
import com.junittest.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerforCalculator {

	public static void main(String[] args) {
		 Result result = JUnitCore.runClasses(junitannotation.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	         
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
	} 
	


