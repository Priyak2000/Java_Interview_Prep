package top_20_java_program;

public class SecondMin {
	public static void main(String[] args) {
		int arr[]= {1,3,7,10,6,9};
		int first_min=Integer.MAX_VALUE;
		int second_min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<first_min) {
				second_min=first_min;
				first_min=arr[i];
				
			}
			else if(arr[i]<second_min&&arr[i]!=first_min) {
				second_min=arr[i];
			}
		}
		System.out.println("Second Minimum value ="+ second_min);
	
}
}
 