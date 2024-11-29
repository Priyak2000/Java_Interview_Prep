package top_20_java_program;

import java.util.HashSet;
import java.util.Set;

public class CommonElem {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,7,8,3};
		Set<Integer> set=new HashSet<>();
		Set<Integer> comSet=new HashSet<>();
		for(int i:arr1) {
			set.add(i);
		}
		for(int i:arr2) {
			if(set.contains(i))
				comSet.add(i);
		}
		System.out.println(comSet);
	}
}
