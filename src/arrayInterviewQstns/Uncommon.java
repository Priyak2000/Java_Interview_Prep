package arrayInterviewQstns;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Uncommon {
	public static void main(String[] args) {
		int arr1[]= {1,3,7,3,0};
		int arr2[]= {2,3,2,1,9};
		List<Integer> list1= Arrays.stream(arr1).boxed().collect(Collectors.toList());
		List<Integer> list2 = new ArrayList<>();
		for(int i:arr2) {
			list2.add(i);
		}
		Set<Integer> unCommon=new LinkedHashSet<>();
		for(int i:list1) {
			if(!list2.contains(i))
				unCommon.add(i);
		}
		for(int i:list2) {
			if(!list1.contains(i))
				unCommon.add(i);
		}
		System.out.println(unCommon);
	}

}
