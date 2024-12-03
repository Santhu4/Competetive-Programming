import java.util.*;

public class maximum_subarray {
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4,5,-6,-7};  // You can modify this array as needed
        int csum = arr[0];  // Current sum, initialized to the first element
        int rsum = arr[0];  // Running sum or maximum sum, also initialized to the first element

        for(int i = 1; i < arr.length; i++){
            // Choose the maximum between the current element and the sum of the current subarray
            csum = Math.max(arr[i], csum + arr[i]);
            // Update the running sum (maximum subarray sum so far)
            rsum = Math.max(rsum, csum);
        }

        System.out.println("Maximum subarray sum is: " + rsum);
    }
}
