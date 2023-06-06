package week3.day2;
import mylibrary.BasicIO;
public class SwitchCase4 {

	public static void main(String[] args) {
		//Declare
		int choice,add,sub,div,prd,firstNumber,secondNumber,result;
		BasicIO.printMessage("Enter any(1-6) number:");
		choice=BasicIO.readInt();
		BasicIO.newLine();
		BasicIO.printMessage("Enter first number:");
		firstNumber=BasicIO.readInt();
		BasicIO.newLine();
		BasicIO.printMessage("Enter second number:");
		secondNumber=BasicIO.readInt();
		BasicIO.newLine();
		switch(choice) {
		case 1:
			add=firstNumber+secondNumber;
			result=add;
			System.out.println("Add of two number: "+result);
			break;
		case 2:
			sub=firstNumber-secondNumber;
			result=sub;
			System.out.println("sub of two number: "+result);
			break;
		case 3:
			div=firstNumber/secondNumber;
			result=div;
			System.out.println("div of two number: "+result);
			break;
		case 4:
			prd=firstNumber*secondNumber;
			result=prd;
			System.out.println("prd of two number: "+result);
			break;
			default:
				System.out.println("Exit");
			
			
		}

	}

}
