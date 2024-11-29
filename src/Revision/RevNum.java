package Revision;

public class RevNum {
	public static void main(String[] args) {
		int num=262;
		int original=num,rem,rev=0;
	int count=0;
		while(num!=0) {
			rem=num%10;
			rev=rem+rev*10;
			num=num/10;
		}
		System.out.println("Rev number :" + rev);
		if(rev==original) {
			System.out.println("given number is palindrom");
		}
		else {
			System.out.println("Given number is not palidrome");
		}
		
	}

}
