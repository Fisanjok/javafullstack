package week3.day4;

import mylibrary.BasicIO;
import mylibrary.Calculator;

public class DoWhile2 {

	public static void main(String[] args) {
		// declare
		int choice;
		char ch;
		do {
			// input
			BasicIO.printMessage("-----Main Menu-----");
			BasicIO.newLine();
			BasicIO.printMessage("1.ADD");
			BasicIO.newLine();
			BasicIO.printMessage("0.Exit");
			BasicIO.newLine();
			BasicIO.printMessage("------------");
			BasicIO.newLine();
			BasicIO.printMessage("Enter your choice");
			choice = BasicIO.readInt();
			if ((choice == 0) || (choice <= 1)) {
				if (choice == 0) {
					System.exit(0);// Exit Application
				} else if (choice == 1) {
					// sum
					int num1, num2, num3;
					// read two values from user
					BasicIO.printMessage("Enter first number :");
					num1 = BasicIO.readInt();
					BasicIO.printMessage("Enter second number :");
					num2 = BasicIO.readInt();
					// calculate sum as result
					num3 = Calculator.sum(num1, num2);
					// print result
					BasicIO.printMessage("sum", num3);

				}
			} else {
				BasicIO.printMessage("out of range");
			}
			BasicIO.printMessage("Do yo want to continue :Y/N");
			ch = BasicIO.readChar();

		} while (ch == 'y' || ch == 'Y');
	}

}
