package top_20_java_program;

public class BinarySerach {
	public static void main(String[] args) {
		int arr[]= {1,2,3,6,9,10};
		int target=6;
	
		int res= BinarySearch(arr,0,arr.length-1,target);
		if(res==-1)
			System.out.println("Target is not found");
		else
			System.out.println("Target found at " + res);
		
	}

	private static int BinarySearch(int[] arr, int low, int high, int target) {
		if(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				return BinarySearch(arr,mid+1,high,target);
			else
				return BinarySearch(arr,low,mid-1,target);
		}
		return -1;
		
		
	}

}
