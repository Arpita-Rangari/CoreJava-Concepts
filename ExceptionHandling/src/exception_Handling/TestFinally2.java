package exception_Handling;

public class TestFinally2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		try {
			testMe();
			System.out.println("back to main");
		}
		
		catch (Exception e) {
			System.out.println("inside catch all of main");
		}
		

	}
	private static void testMe() {
		try {
			System.out.println("inside method try");
			String [] ss = {"aa","bb"};
			System.out.println(ss[1]);
			boolean flag = true;
			if(flag) {
				System.exit(0);
			}}
			finally {
				System.out.println("within method  finally end");
			}
		System.out.println("method end");
		
	}
}
