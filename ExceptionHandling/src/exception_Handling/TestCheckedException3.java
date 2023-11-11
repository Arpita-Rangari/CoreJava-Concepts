package exception_Handling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestCheckedException3 {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date of birth :dd/MM/yyyy");
		System.out.println("DOB : "+parseDob(sc.next()));
	}
	//writing a method to parse the string into date
	private static Date parseDob(String dob) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(dob);
			return date;
		}
		catch(ParseException e) {
			e.printStackTrace();
			
		}
		return null;
	}

}
