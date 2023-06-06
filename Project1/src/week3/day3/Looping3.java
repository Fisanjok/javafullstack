package week3.day3;

public class Looping3 {

	public static void main(String[] args) {
		//Thread.sleep(0);
		int start=1;
		int stop=5;
		final int INTERVAL=1000; // millisecond
		try {
			while(start<=stop) {
				System.out.println(start);
				Thread.sleep(INTERVAL);
				start++;
			}	
		}
			catch(Exception ex) {
				System.out.println("Error :"+ex.getMessage());
		
			
		
		
		}
		finally {
			System.out.println("Finally");

		}
	}
}


