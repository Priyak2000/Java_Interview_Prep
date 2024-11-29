package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToMap {
	public static void main(String[] args) {
		//array to list
		int arr[]= {1,2,5,7,8,7,10};
		List<Integer> list=new ArrayList<>();
		for(Integer c:arr) {
			list.add(c);
		}
		
		System.out.println("Array to list :" +list);
	
		//list to set
		Set<Integer>set=new HashSet<>();
		for(Integer c:list) {
			set.add(c);
		}
		System.out.println("List to set :" +set);
		
		//

}
}

