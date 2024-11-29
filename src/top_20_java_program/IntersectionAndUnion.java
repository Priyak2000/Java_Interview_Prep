package top_20_java_program;

import java.util.*;


public class IntersectionAndUnion {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=scan.nextInt();
		}
		
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=scan.nextInt();
		}
		Set<Integer> union=new HashSet<>();
		Set<Integer> intersection=new HashSet<>();
		
		for(int c: arr1) {
			union.add(c);
		}
		for(int c: arr2) {
			union.add(c);
		}
		
		System.out.println("Union : " + union);
		
		for(int c: arr1) {
			intersection.add(c);
		}
		for( int c: arr2) {
			if(intersection.contains(c)){
				System.out.print(c+ " " );
			}
		}
		
	}

}
