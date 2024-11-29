package top_20_java_program;

import java.util.Arrays;

public class SortArrString {
	public static void main(String[] args) {
		String [] arr= {"Ammu", "Priya", "Kavi", "Muthu"};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
