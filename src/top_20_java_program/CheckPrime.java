package top_20_java_program;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scan.nextInt();
		System.out.println(checkPrimeOrNot(num));
	}

	private static boolean  checkPrimeOrNot(int num) {
		if(num<=1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	
	}

}
