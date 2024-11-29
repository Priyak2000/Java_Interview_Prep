package arrayInterviewQstns;

import java.util.Arrays;

public class MergerArr {
	public static void main(String[] args) {
		int arr1[]= {1,3,7,3,0};
		int arr2[]= {2,3,2,1,9};
		
		int mergeArr[]=new int[arr1.length+arr2.length];
		int index=0;
		for(int i=0;i<arr1.length;i++) {
			mergeArr[index++] =arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			mergeArr[index++] =arr2[i];
		}
		
		System.out.println(Arrays.toString(mergeArr));
	}

}
