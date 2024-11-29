package top_20_java_program;

public class SecondLargestElement {
	public static void main(String[] args) {
		int arr[]= {1,4,5,9,10,19,9,12,12};
		int first_largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first_largest) {
				second_largest=first_largest;
				first_largest=arr[i];
			}
			else if(arr[i]>second_largest&&arr[i]!=first_largest) {
				second_largest=arr[i];
			}
		}
		System.out.println("Second largest element = "+ second_largest );
	}

}
