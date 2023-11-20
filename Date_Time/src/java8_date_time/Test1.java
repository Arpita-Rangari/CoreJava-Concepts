package java8_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Test1 {
	public static void main (String args []) {
		Date d1 = new Date();
		System.out.println(d1);// Sat Nov 11 18:55:49 IST 2023
		
		//to display the current date
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//to display the current time
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//display time as well as date
		LocalDateTime timeStamp = LocalDateTime.now();
		System.out.println(timeStamp);
	}
	
	
	

}
