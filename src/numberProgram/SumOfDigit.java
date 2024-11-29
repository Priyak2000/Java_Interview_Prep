package numberProgram;

public class SumOfDigit {
	public static void main(String[] args) {
		int n=1234;
		int sum=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			sum+=rem;
			n=n/10;
			
		}
		System.out.println("Sum of digit :" + sum);
	}

}
