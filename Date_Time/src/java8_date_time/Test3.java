package java8_date_time;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import static java.time.LocalDate.now;
import static java.time.LocalDate.parse;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("enter the DOB : yyyy-MM-dd");
			LocalDate dob = parse(sc.next());
			System.out.println("DOB : "+dob);
			int age = Period.between(dob, now()).getYears();
			System.out.println("Age"+age);
		}

	}

}
