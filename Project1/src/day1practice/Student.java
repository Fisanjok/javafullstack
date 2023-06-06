package day1practice;
import java.util. Scanner;
public class Student {

	public static void main(String[] args) {
		// using try catch
		try {
		String name;// declare name as string type
		int rollno; // declare roll no as integer type
		char section;// declare section as char type
		float total, average;// declare total,average as float type
		Scanner sc = new Scanner(System.in);// scanner class
		int marks[] = new int[3];// declare and initialize array
		System.out.println("Enter student details: ");
		System.out.println("Enter student name: ");
		name = sc.nextLine();
		System.out.println("Enter student rollno: ");


		rollno = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student section: ");
		section = sc.next().charAt(0);
		System.out.println("Enter student marks: ");
		for (int i = 0; i < marks.length; i++) {
		marks[i] = sc.nextInt();// taking input as array
		}
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(section);
		System.out.println("student marks of Math:" + marks[0]);
		System.out.println("student marks of Science:" + marks[1]);
		System.out.println("student marks of Java:" + marks[2]);
		total = marks[0] + marks[1] + marks[2];
		System.out.println("total marks obtain out of 300:" + total);
		average = (marks[0] + marks[1] + marks[2]) / 3;
		System.out.println("average marks obtain:" + average);
		if (average >= 40) {



		System.out.println("result pass with average marks " + average);
		} else {
		System.out.println("result failed with average marks " + average);
		}
		} catch (Exception ex) {
		System.err.println("error message: " + ex.getMessage());
		}finally {
		System.out.println("finally is called!");
		}
		}
		


	}


