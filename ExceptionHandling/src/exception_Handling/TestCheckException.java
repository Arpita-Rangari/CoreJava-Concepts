package exception_Handling;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestCheckException {
	public static void main(String args []) {
		try {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm"
					+ "-dd");
			System.out.println("enter the date in the format of yr-mon-day");
			Date dob = sdf.parse(sc.next()); //convert the string into date
			System.out.println(dob); //the parsed date will be printed here
			sc.close();
			System.out.println("end of the try block");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
