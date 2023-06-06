package week3.day1;

public class Class1 {
	//Why we are using static?
	//Application of static block?
	static
	{
		System.out.println("Hello");
	}
	
	static
	{
		System.out.println("Hello2");
	}
	

	public static void main(String[] args) {
		//Expression -> Valid Java Terms(code)
		int firstNumber,secondNumber,thirdNumber;//Statement
		firstNumber=45;
		secondNumber=32;
		thirdNumber=firstNumber+secondNumber;
		System.out.println(thirdNumber);

	}//Block Code
	static
	{
		System.out.println("Hello3");
	}

}
