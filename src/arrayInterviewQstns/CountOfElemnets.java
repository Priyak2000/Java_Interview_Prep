package arrayInterviewQstns;

import java.util.HashMap;
import java.util.Map;

public class CountOfElemnets {
	public static void main(String[] args) {
	int arr[]= {1,2,3,2,5,4,2,5,7,1,0};
	Map<Integer,Integer>map=new HashMap<>();
	for(int i:arr) {
		map.put(i, map.getOrDefault(i,0)+1);
	}
	System.out.println(map);
	int max=0;
	for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
		if(entry.getValue()>max)
			max=entry.getKey();
	}
	System.out.println("max occured element : " + max);
	}
	
}
