package top_20_java_program;

import java.util.Scanner;

public class PrimeNumRang {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int start=scan.nextInt();
		int end=scan.nextInt();
		System.out.println("Prime number in range :");
		for(int i=start;i<end;i++) {
			if(isPrime(i))
				System.out.print(i);
		}
		
	}
	public static boolean isPrime(int number) {
		if(number <=1)
		return false;
		for(int i=2;i<number;i++) {
			if(number%i==0)
				return false;
		}
		return true;
				
		}
		
	}


