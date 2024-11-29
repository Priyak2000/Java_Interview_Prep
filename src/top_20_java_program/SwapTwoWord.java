package top_20_java_program;

public class SwapTwoWord {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="World";
		System.out.println("Before swaping s1 :" + s1);
		System.out.println("Before swaping s2 :" + s2);
		s1=s1+s2;//HelloWorld
		s2=s1.substring(0, 5);
		s1=s1.substring(5);
		
		System.out.println("After swaping s1 :" + s1);
		System.out.println("After swaping s2 :" + s2);
		
	
	}

}
