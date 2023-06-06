package week3.day3;
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class DateandTime {

	public static void main(String[] args) {
		try {
			
		}
		catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
		}
		finally {
			System.out.println("Finally");
		}
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));  

	}

}
