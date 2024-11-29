package top_20_java_program;

import java.util.Arrays;

public class mergeTwoArr {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		int mergedArr[]=merge(arr1,arr2);
		System.out.println("merged Array :" + Arrays.toString(mergedArr));
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		int mergedArr[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			mergedArr[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			mergedArr[arr1.length+i]=arr2[i];
		}
		
		return mergedArr;
	}

}
