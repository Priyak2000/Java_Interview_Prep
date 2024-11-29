package numberProgram;

import java.util.Scanner;

public class PrimeNumInRange {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		int e=scan.nextInt();
			for(int i=s;i<=e;i++) {
				if(isPrime(i))
				System.out.println(i + " ");
		}
	}
	private static boolean isPrime(int num) {
		if(num<=1)
		return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}

}
