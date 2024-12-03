public class max_subarray_sum {
    public static void main(String[] args) {
        int arr[] = {-10,-1,-8,-9,-4,-5,-3,-8};
        int rsum = arr[0];
        int csum = arr[0];
        for(int i = 1;i<arr.length;i++){
            rsum = Math.max(rsum+arr[i],rsum);
            rsum = Math.max(csum,rsum);
             rsum = csum;
        }
        System.out.println(rsum);
    }
}
