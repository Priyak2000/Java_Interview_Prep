package top_20_java_program;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int a=2;
		int b=3;
		System.out.println("Before swapping :" +"a :"+a + " & " + "b :" +b );
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping :" +"a :"+a + " & " + "b :" +b );
	}

}
