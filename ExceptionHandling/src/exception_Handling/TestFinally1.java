package exception_Handling;

public class TestFinally1 {
	public static void main (String args []) {
		System.out.println("1");
		try {
			testMe();
			System.out.println("back to main --> main try block");
		}
		catch(Exception e) {
			System.out.println(e+"catch block --> main");
		}
		finally {
			System.out.println("inside main finally");
		}
		System.out.println("inside main end");
	}
	private static void testMe() {
		try {
			System.out.println("in method try block");
			String [] s = {"aa","bb"};
			System.out.println(s[5]);
			boolean flag = true;
			if(flag)
				return;
			System.out.println("end of try");
			
		}
		finally {
			System.out.println("inside finally ");
		}
		System.out.println("inside the methods end");
	}
}
