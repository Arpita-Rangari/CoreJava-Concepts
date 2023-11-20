package java8_date_time;

import java.util.Scanner;
import java.time.LocalDate;
import static java.time.LocalDate.parse;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner (System.in)){
			System.out.println("enter the manufacturing date : yyyy-MM-dd");
			LocalDate manufactureDate = parse(sc.next());
			System.out.println("enter the shelf life in days");
			LocalDate expdate =manufactureDate.plusDays(sc.nextLong());
			System.out.println("product expires on "+expdate);
		
			
		
		}

	}

}
