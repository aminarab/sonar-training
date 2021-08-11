package ir.amin.sonar.training;

import org.junit.Assert;
import org.junit.Test;



public class CalculatorUT {
	
	private Calculator calculator = new Calculator();
	
	@Test
	public void addTest(){
		Assert.assertEquals(3 , calculator.add(1, 2));
	}
	
}
