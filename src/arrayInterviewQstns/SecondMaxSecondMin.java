package arrayInterviewQstns;

public class SecondMaxSecondMin {
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,5,4,2,5,7,1,0};
		int firstMax=arr[0];//Integer.Min
		int secondMax=arr[0];
		int firstMin=arr[0];
		int secondMin=arr[0];
		
		if (arr.length < 2) {
            System.out.println("Array needs to have at least two elements");
            return;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstMax)
			{
				secondMax=firstMax;
				firstMax=arr[i];
			}
			if(arr[i]>secondMax&&arr[i]!=firstMax)
				secondMax=arr[i];
			
			if(arr[i]<firstMin)
			{
				secondMin=firstMin;
				firstMin=arr[i];
			}
			if(arr[i]<secondMin&&arr[i]!=firstMin)
				secondMin=arr[i];
			
			
		}
		System.out.println("Second max : " + secondMax);
		System.out.println("Second min : " + secondMin);
	}

}
