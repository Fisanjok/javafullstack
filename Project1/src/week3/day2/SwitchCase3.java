package week3.day2;
import mylibrary.BasicIO;
public class SwitchCase3 {

	public static void main(String[] args) {
		// Enter any character : _A |B
		// A is vowel
		
		// Enter any character : _B
		//B is consonant
		char ch;
		BasicIO.printMessage("Enter any character : ");//read character value
		ch=BasicIO.readChar();
		
		switch(ch) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
		System.out.println("Vowel");
		break;
		
		default:
			System.out.println("Consonent");
		}

	}

}
