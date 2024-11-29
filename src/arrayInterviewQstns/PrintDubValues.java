package arrayInterviewQstns;

import java.util.HashSet;
import java.util.Set;

public class PrintDubValues {
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,5,4,2,5,7,1,0};
		Set<Integer> dub=new HashSet<>();
		for(int i:arr) {
			if(!dub.add(i))
				System.out.print(i + ", ");
				
		}
		
	}

}
