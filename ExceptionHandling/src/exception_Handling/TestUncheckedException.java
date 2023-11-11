package exception_Handling;

import java.util.Scanner;

public class TestUncheckedException {
	//compiler forces the handling of checked exception only
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer value");
		System.out.println("value"+sc.nextInt());
		sc.close();
		System.out.println("main over");
	}

}
