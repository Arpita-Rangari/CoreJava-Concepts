package exception_Handling;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String args []) {
		try(Scanner sc = new Scanner(System.in))
		{	
		System.out.println("enter age");
		System.out.println("age"+sc.nextInt());
		System.out.println("end of try with resources");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("main over");
		}
		

}
