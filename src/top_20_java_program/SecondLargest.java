package top_20_java_program;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[]= {1,2,7,8,10,11};
		int max=arr[0];
		int secondMax=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax&&arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		System.out.println("Second max :" + secondMax);
	}

}
