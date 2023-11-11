package exercise;

import java.util.Scanner;

/*
Objective :
Check the speed of vehicle on a freeway or expressway.
 If the speed is within a range , allow driver to continue
Otherwise , alert the driver , by raising (throwing) custom 
exception, with suitable message.*/
public class SpeedChecker {

	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the speed");
		int speed = sc.nextInt();
		Vehicle v = new Vehicle(speed);
		try {
		v.checkSpeed();
		System.out.println("inside main");
	}
		catch(MyException e) {
			System.out.println(e.getMessage()
					);
			
		}
}
}