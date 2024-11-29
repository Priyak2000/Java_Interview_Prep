package arrayInterviewQstns;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("Ēnter the element of matrix : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Matrix is : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
