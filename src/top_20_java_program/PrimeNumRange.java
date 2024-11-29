package top_20_java_program;

import java.util.Scanner;

public class PrimeNumRange {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int start=scan.nextInt();
		int end=scan.nextInt();
		System.out.println("Prime numbers is given range : " + " ");
		int sum=0;
		for(int i=start;i<end;i++) {
			if(isPrime(i)) {
				System.out.print(i);
				sum+=i;
			}
		}
		System.out.println("Sum of prime numbers in given range :" + sum);
		
	}
	public static boolean isPrime(int number) {
		if(number<=1)
			return false;
		for(int i=2;i<number;i++) {
			if(i%number==0)
				return false;
			
		}
		return true;
	}

}
