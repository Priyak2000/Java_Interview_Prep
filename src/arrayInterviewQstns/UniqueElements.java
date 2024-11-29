package arrayInterviewQstns;

import java.util.HashMap;
import java.util.Map;

public class UniqueElements {
public static void main(String[] args) {
	int arr[]= {1,2,3,2,5,4,2,5,7,1,0};
	Map<Integer,Integer>map=new HashMap<>();
	for(int i:arr) {
		map.put(i, map.getOrDefault(i,0)+1);
	}
	System.out.print("Unique elements in given array :" + " ");
	for(int i:arr) {
		if(map.get(i)==1)
			System.out.print(i + ",");
	}
}
}
