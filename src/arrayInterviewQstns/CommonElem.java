package arrayInterviewQstns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CommonElem {
	public static void main(String[] args) {
		int arr1[]= {1,3,7,3,0};
		int arr2[]= {2,3,2,1,9};
		Set<Integer> set=new HashSet<>();
		Set<Integer> commonSet=new HashSet<>();
		for(int i:arr1) {
			set.add(i);
		}
		for(int i:arr2) {
			if(set.contains(i))
			commonSet.add(i);
		}
		
		for(int c:commonSet) {
		System.out.print(c+ " ");
		}
	}

}
