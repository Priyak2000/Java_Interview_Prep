package arrayInterviewQstns;

import java.util.HashSet;
import java.util.Set;

public class RemoveDubFillWith1 {
	public static void main(String[] args) {
		int input[]= {4, 5, 9, 4, 9, 7, 5, 3};
				//Output: [4, 5, 9, 7, 3, -1, -1, -1]
		Set<Integer> set=new HashSet<>();
		int res[]=new int[input.length];
		int index=0;
		for(int i=0;i<input.length; i++) {
			if(!set.contains(input[i])) {
				set.add(input[i]);
				res[index++]=input[i];
			}
		}
			while(index<input.length) {
				res[index++]=-1;
			}
			
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
		
	}

}
