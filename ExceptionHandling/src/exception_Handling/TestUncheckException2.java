package exception_Handling;

public class TestUncheckException2 {

	public static void main (String args []) {
		try {
			int a=100;
			int b=2;
			System.out.println(a/0);
		}
		catch(Exception e) {
			System.out.println("inside catch");
			System.out.println("err msg"+e.getMessage());
			System.out.println("err msg + name "+e);
			System.out.println("complete details");e.printStackTrace();
		}
		System.out.println("main continues");
	}
}
