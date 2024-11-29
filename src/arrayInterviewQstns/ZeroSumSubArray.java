package arrayInterviewQstns;
import java.util.HashMap;
public class ZeroSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 7, -3, 4, 6, 2, 5, -5};
        findZeroSumSubarrays(arr);
    }
    private static void findZeroSumSubarrays(int[] arr) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;
        boolean foundZeroSum = false;

        // Insert initial sum value in map
        sumMap.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Check if sum is already in map
            if (sumMap.containsKey(sum)) {
                foundZeroSum = true;
                int startIndex = sumMap.get(sum) + 1;
                System.out.println("Zero-sum subarray from index " + startIndex + " to " + i + ":");
                for (int j = startIndex; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }

            // Insert the sum with its index into map
            sumMap.put(sum, i);
        }

        if (!foundZeroSum) {
            System.out.println("No zero-sum subarray found.");
        }
    }
}
