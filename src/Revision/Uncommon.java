package Revision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Uncommon {
	public static void main(String[] args) {
		int arr1[]= {1,3,7,3,0};
		int arr2[]= {2,3,2,1,9};
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		Set<Integer> set=new HashSet<>();
		for(int i:arr1) {
			list1.add(i);
		}
		for(int i:arr2) {
			list2.add(i);
		}
		for(int i:list1) {
			if(!list2.contains(i))
				set.add(i);
		}
		for(int i:list2) {
			if(!list1.contains(i))
				set.add(i);
		}
		System.out.println(set);
	}

}
