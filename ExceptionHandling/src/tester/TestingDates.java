package tester;

import java.util.Date;

public class TestingDates {
	public static void main (String [] args) {
		Date currentDate = new Date();
		System.out.println(currentDate); //will give the name of the day , month and day along with the time in hh:mm:ss IST 2023
	
		Date d1 = new Date(5000);
		System.out.println(d1);
		
		
		System.out.println(d1.before(currentDate)); //true
		System.out.println(d1.after(currentDate));//false
		System.out.println(d1.compareTo(currentDate)); //<0
		
	}

}
