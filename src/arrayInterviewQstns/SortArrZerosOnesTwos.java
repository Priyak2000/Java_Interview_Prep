package arrayInterviewQstns;

public class SortArrZerosOnesTwos {
	public static void main(String[] args) {
		int arr[]= {2, 0, 2, 1, 1, 0};
				//Output: [0, 0, 1, 1, 2, 2]
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		

	}

}
