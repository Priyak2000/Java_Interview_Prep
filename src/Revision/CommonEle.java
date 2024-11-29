package Revision;

import java.util.HashSet;
import java.util.Set;

public class CommonEle {
	public static void main(String[] args) {
		int arr1[]= {1,3,7,3,0};
		int arr2[]= {2,3,2,1,9};
		Set<Integer> set=new HashSet<>();
		Set<Integer> common=new HashSet<>();
		for(int i:arr1) {
			set.add(i);
		}
		for(int i:arr2) {
			if(set.contains(i)) {
				common.add(i);
			}
		}
		System.out.println(common);
		
	}

}
