package arrayInterviewQstns;

public class SecondMaxAndMin {
	public static void main(String[] args) {
		int arr[]= {1,2,7,10,3,20};
		int firstMax=Integer.MIN_VALUE;
		int firstMin=Integer.MAX_VALUE;
		int secondMax=Integer.MIN_VALUE;
		int secondMin=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstMax) {
				secondMax=firstMax;
				firstMax=arr[i];
			}
			if(secondMax<arr[i] && firstMax>arr[i]) {
				secondMax=arr[i];
			}
			if(arr[i]<firstMin) {
				secondMin=firstMin;
				firstMin=arr[i];
			}
			if(secondMin>arr[i] && firstMin<arr[i]) {
				secondMin=arr[i];
			}
			
			
		}
		System.out.println("Second Max :" +  secondMax);
		System.out.println("Second min :" + secondMin);
		
	}

}
