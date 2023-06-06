package week3.day4;

import mylibrary.BasicIO;

public class ArrayBasic2 {

	public static void main(String[] args) {
		final int MAX=5;
		int num[]=new int[MAX];
		//input
		for(int i=0;i<MAX;i++) {
			BasicIO.printMessage("Enter number"+(i+1)+":");
			num[i]=BasicIO.readInt();
			
			
		}
		//processing
		for(int i=0;i<MAX;i++){
			num[i]=num[i]+1;
			
		}
		//output
		for(int i=0;i<MAX;i++) {
			BasicIO.printMessage("Value"+(i+1)+":"+num[i]);
		}

	}

}
