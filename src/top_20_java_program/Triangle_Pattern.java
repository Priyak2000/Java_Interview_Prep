package top_20_java_program;

import java.util.Scanner;

public class Triangle_Pattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int start=scan.nextInt();
		int end=scan.nextInt();
		char c=scan.next().charAt(0);
		scan.close();
		
		//Pyramid pattern
		
		for(int i=start;i<=end;i++) {
			for(int j=start;j<=end-i;j++) {
				System.out.print(" ");
			}
			for(int k=start;k<=i;k++) {
				System.out.print(" "+c);
			}
			System.out.println();
		}
		
		//Right Angle
		for(int i=start;i<=end;i++) {
			for(int j=start;j<=end-i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=start;k<=i;k++) {
				System.out.print(" "+k);
			}
			System.out.println();
		}
		
		//Left Angle
		for(int i=start;i<=end;i++) {
			for(int j=start;j<=i;j++) {
				System.out.print(" "+c);
			}
			System.out.println();
		}
		
	}

}
