package week3.day3;

import mylibrary.BasicIO;

public class Looping2 {
	static int start, stop, firstNumber, secondNumber;

	static float avg;
	static int sum = 0;

	public static void sum() {

		BasicIO.printMessage("start: ");
		start = BasicIO.readInt();
		BasicIO.printMessage("stop: ");
		stop = BasicIO.readInt();
		while (start <= stop) {
			BasicIO.printMessage("Increment", start);
			sum += start;
			BasicIO.printMessage("sum of 1-10", sum);
			start++;
		}

	}

	public static void average() {

		BasicIO.printMessage("firstNumber: ");
		firstNumber = BasicIO.readInt();
		BasicIO.printMessage("secondNumber: ");
		secondNumber = BasicIO.readInt();

		avg = (firstNumber + secondNumber) / 2;
		BasicIO.printMessage("Average ", avg);
	}

	public static void oddEven() {

		BasicIO.printMessage("firstNumber: ");
		firstNumber = BasicIO.readInt();

		if ((firstNumber % 2) != 0) {
			BasicIO.printMessage("it is odd number");
		} else {
			BasicIO.printMessage("it is even number");
		}

	}

	public static void main(String[] args) {

		int choice;
		String str;
		do {
			BasicIO.printMessage("press 1-4");
			BasicIO.newLine();
			BasicIO.printMessage("press 1 for sum of (1-10)");
			BasicIO.newLine();
			BasicIO.printMessage("press 2 for avg of (1-10)");
			BasicIO.newLine();
			BasicIO.printMessage("press 3 for even/odd of (1-10)");
			BasicIO.newLine();
			BasicIO.printMessage("press 4 exit");
			BasicIO.newLine();

			choice = BasicIO.readInt();

			switch (choice) {
			case 1:
				sum();
				BasicIO.newLine();
				break;
			case 2:
				average();
				BasicIO.newLine();
				break;
			case 3:
				oddEven();
				BasicIO.newLine();
				break;
			case 4:
				System.exit(0);
				break;

			default:
				BasicIO.printMessage("invalid number");
			}
			BasicIO.printMessage("do you want continue y/n");
			str = BasicIO.readString();
		} while (str.equalsIgnoreCase("y"));

	}

}