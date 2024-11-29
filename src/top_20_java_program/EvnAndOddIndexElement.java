package top_20_java_program;

public class EvnAndOddIndexElement {
	public static void main(String[] args) {
		
		int arr[]={1,4,3,8,2,5};
		int oddIndexCount=0;
		int evenIndexCount=0;
		int oddIndex[]=new int[arr.length/2];
		int evenIndex[]=new int[arr.length/2];
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				evenIndex[evenIndexCount++]=arr[i];
				
			}
			else {
				oddIndex[oddIndexCount++]=arr[i];
			}
		}
		System.out.println("Odd Index elements");
		for(int i=0;i<oddIndexCount;i++) {
			System.out.println(oddIndex[i]);
		}
		System.out.println();
		System.out.println("Even Index elements");
		for(int i=0;i<evenIndexCount;i++) {
			System.out.println(evenIndex[i]);
		}
		System.out.println();
	}

}
