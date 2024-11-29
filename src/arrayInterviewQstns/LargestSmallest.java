package arrayInterviewQstns;

import java.util.Arrays;

public class LargestSmallest {
	public static void main(String[] args) {
	int arr[]= {1,2,3,2,5,4,2,5,7,1,0};
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max)
			max=arr[i];
		if(arr[i]<min)
			min=arr[i];
	}
	System.out.println(max);
	System.out.println(min);
	//Using lamda
	int largest=Arrays.stream(arr).max().getAsInt();
	System.out.println(largest);
	}
}
