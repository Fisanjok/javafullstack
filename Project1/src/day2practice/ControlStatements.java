package day2practice;

public class ControlStatements {

	public static void main(String[] args) {
		//Relational operators
		//==, !=, <=, >=, <
		// compare two value and return boolean
		int firstNumber,secondNumber;
		firstNumber=89;
		secondNumber=73;
		boolean result=(firstNumber==secondNumber);
		System.out.println(result);
		
		//Value1 Operator Value2
		
		
		//if statement
		/*
		 * resutlt1=condition;
		  if(condition){
		  Statement(s) for true
		  }
		  
		  resutlt1=condition;
		  if(result1){
		  Statement(s) for true
		  }
		 */
		//without using reusability
		if(firstNumber<0) {
			System.out.println("hi");
		}
		//with using reusability
		//result1=condition
		boolean result1=result;
		if(result1) {
			System.out.println("hi");
		}
		
		
		
		
	}

}
