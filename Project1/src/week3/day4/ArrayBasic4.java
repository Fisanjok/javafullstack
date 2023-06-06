package week3.day4;

import mylibrary.BasicIO;

public class ArrayBasic4 {

	public static void main(String[] args) {
		final int MAX=5;//declare and initialize
		int num[]=new int[MAX];//initialize array
		int sum,average;
		//read value from user
		BasicIO.printMessage("Enter number");
		for(int i=0;i<num.length;i++) {
			num[i]=BasicIO.readInt();
		}
		//calculate sum of the elements
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
			BasicIO.printMessage("sum of array"+sum);
		}
		//calculate average of the elements
		//print sum and average of the elements
		//find a specific number and display number in elements
		//find and display max number of elements
		//find and display min number of elements
		
		

	}

}
