package top_20_java_program;

public class LrgestAndSmallest {
	public static void main(String args[]) {
		int arr[]= {1,4,3,7,9,2};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else if(arr[i]<smallest)
				smallest=arr[i];
		}
		System.out.println("Largest element is " + largest);
		System.out.println("Smallest element is " + smallest);
		
	}
}
