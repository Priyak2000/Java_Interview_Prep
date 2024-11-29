package arrayInterviewQstns;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountDup {
	public static void main(String[] args) {
		int arr[]= {2,3,4,2,1,3};
		/*Set<Integer> set=new HashSet<>();
		for(int i:arr) {
			if(!set.add(i)) {
			
			}
		
		}
		System.out.println(set.size());*/
		int count=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:arr) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		Set<Integer> set=new HashSet<>();
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				set.add(entry.getKey());
			}
		}
	//System.out.println("Dub values :" + set);
	System.out.println("Dub values count :" + set.size());
		
	}
	

}
