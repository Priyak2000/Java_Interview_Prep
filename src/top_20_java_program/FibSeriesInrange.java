package top_20_java_program;

import java.util.Scanner;

public class FibSeriesInrange {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int first=scan.nextInt();
		int second=scan.nextInt();
		int e=scan.nextInt();
		scan.close();
		fibbSeries(first, second, e);
		
	}
	public static void fibbSeries( int first, int second, int e) {
		int n1=first;
		int n2=second;
		int n3;
		
		System.out.print(n1 + " " + n2 + " ");
		for(int i=n2;i<e;i++) {
			n3=n1+n2;
			System.out.print(n3 + " ");
			n1=n2;
			n2=n3;
		}
	}

}
