package ir.amin.sonar.training;

import java.util.List;

public class Calculator {

	public int add(int a , int b){
		return a + b;
	}
	
	public int subtract(int a , int b){
		return a - b;
	}
	
	public int division(int a , int b){
		return a / b;
	}
	
	public int multiply(int a , int b){
		return a * b;
	}
	
	public void nullPointer(List<Integer> list) {
		for (Integer integer : list) {
			System.out.println(integer+5);
		}
	}
	
	
	
}
