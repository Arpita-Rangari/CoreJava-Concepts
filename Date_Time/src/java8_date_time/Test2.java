package java8_date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.LocalDate.now;
import static java.time.LocalDate.parse;

public class Test2 {
	public static void main (String args []) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("enter the DOB : yyyy-MM-dd");
			String date =sc.next();
			LocalDate dob = parse(date);
			System.out.println(dob);
			LocalDate today = now();
			System.out.println(dob.compareTo(today));
			System.out.println(dob.isBefore(today));
			System.out.println(dob.isAfter(today));
			
			
			
			//to print according to pattern
			LocalDate d1 = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/M/yyyy"));
			System.out.println(d1);
		}
	}

}
