package top_20_java_program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupArr {
	public static void main(String[] args) {
		int arr[]= {1,2,4,3,9,2,1};
		System.out.println("Before removing dublicates :" +Arrays.toString(arr));
		Set<Integer> set=new HashSet<>();
		for(int num:arr) {
			set.add(num);
		}
		System.out.println("After removing dublicates :" +set);
	}

}
