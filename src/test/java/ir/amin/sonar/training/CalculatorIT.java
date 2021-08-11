package ir.amin.sonar.training;

import org.junit.Assert;
import org.junit.Test;



public class CalculatorIT {
	
	private Calculator calculator = new Calculator();
	
	@Test
	public void subTest(){
		Assert.assertEquals(7 , calculator.subtract(10, 3));
	}
	
}
