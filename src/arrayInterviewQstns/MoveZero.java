package arrayInterviewQstns;

public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 2, 2, 0, 6, 6, 6, 4};

        // Step 1: Combine consecutive duplicates
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && arr[i] != 0) {
                arr[i] = arr[i] * arr[i];
               for(int j=i+1;j<arr.length-1;j++) {
            	   arr[j]=arr[j+1];
            	   arr[arr.length-1]=0;
               }
            }
        }
            int result[]=new int[arr.length];
            int index=0;
            for(int i=0;i<arr.length;i++) {
            	if(arr[i]!=0)
            		result[index++]=arr[i];
            }
        
        // Print the result array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
