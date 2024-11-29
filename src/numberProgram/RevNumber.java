package numberProgram;

public class RevNumber {
	public static void main(String[] args) {
		int num=165;
		int original=num;
		int rem, rev=0;
		int count=0;
		while(num!=0) {
			rem=num%10;
			rev=rem+rev*10;
			num=num/10;
		}
		if(rev==original)
			System.out.println("given number is palindrom");
		else
			System.out.println("given num is not palindrom");
		
		System.out.println("rev number :" + rev);
		
	}
	
}
