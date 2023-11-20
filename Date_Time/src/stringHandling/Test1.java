package stringHandling;

public class Test1 {
	public static void main (String args []) {
		String s = "hello";
		System.out.println("After concatenation "+s.concat("hi")); //after concatenation it will not save to the original string
		System.out.println(s);
		s=s+"12345";
		System.out.println(s); //save to original string
		String s1 = s.toUpperCase();
		System.out.println(s1);
		System.out.println(s);
		System.out.println(s.replace('l', 'p'));
		System.out.println(s);
		System.out.println(s.substring(2,6));
		System.out.println(s);
	}

}
