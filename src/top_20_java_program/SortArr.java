package top_20_java_program;

public class SortArr {
	public static void main(String[] args) {
		int arr[]= {1,8,2,7,9,3};
		int temp=0;
		System.out.println("Before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
			}
		}
			//Ascending order
			System.out.println("\nAfter sorting...");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
//			System.out.println();
//			//Descending order
//			for(int i=arr.length-1;i>=0;i--) {
//				System.out.print(arr[i]);
//			}
		}
	}


