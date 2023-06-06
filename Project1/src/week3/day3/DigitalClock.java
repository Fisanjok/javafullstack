package week3.day3;

public class DigitalClock {

	public static void main(String[] args) {
		int hours,seconds,minutes;
		hours=0;
		seconds=0;
		minutes=0;
		try {
			while(hours<=24) {
				System.out.println(hours);
			}
			while(minutes<=60) {
				System.out.println(minutes);
			}
			while(seconds<=60) {
				System.out.println(seconds);
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
