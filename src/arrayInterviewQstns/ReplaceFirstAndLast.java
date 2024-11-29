package arrayInterviewQstns;

public class ReplaceFirstAndLast {
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,8,9};
		System.out.println("Given array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
			int temp=arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=temp;
			System.out.println();
		System.out.println("After replacing elements :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
