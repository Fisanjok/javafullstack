package week3.day4;

public class ArrayBasic3 {

	public static void main(String[] args) {
		//declare and initialize
		int num[]= {6,7,8,9,};
		//increase element by 1
		
		for(int i=0;i<num.length;i++) {
			num[i]++;
		}
		//print elements
		for(int number:num) { //for each next loop in java
			System.out.println(number);
		}

	}

}
