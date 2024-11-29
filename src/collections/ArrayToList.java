package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		int arr[]= {1,2,5,7,8,10};
		List<Integer> list=new ArrayList<>();
		for(Integer c:arr) {
			list.add(c);
		
		System.out.println("Array to list :" +list);
	}

}
}
