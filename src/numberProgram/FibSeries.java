package numberProgram;

import java.util.Scanner;

public class FibSeries {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		//int s=scan.nextInt();
		int n=scan.nextInt();
		int n1=1;
		int n2=2;
		int n3;
		scan.close();
		System.out.print(n1 + "," + n2);
		for(int i=0;i<n;i++) {
			n3=n1+n2;
			System.out.print("," + n3 );
			n1=n2;
			n2=n3;
		}
		
	}

}
