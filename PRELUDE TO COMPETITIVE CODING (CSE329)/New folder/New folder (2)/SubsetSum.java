public class SubsetSum {
    public static boolean isPossible(int idx,int k,int[] arr){
        if(k == 0) return true;
        if(idx == 0) return arr[idx] == k;
        boolean Nottake = isPossible(idx-1, k, arr);
        boolean take = false;
        if(arr[idx]<=k){
        take = isPossible(idx-1, k-arr[idx], arr);
        }
        return take || Nottake;
    }
    public static boolean dp(int arr[],int n,int k){
        boolean dp[][] = new boolean[n][k+1];
        for(int i = 0;i<n;i++) dp[i][0] =  true;
        dp[0][arr[0]] = true;
        for(int i = 1;i<n;i++){
            for(int j = 1;j<=k;j++){
                boolean Nottake = dp[i-1][j];
                boolean take = false;
                if(arr[i]<=j){
                    take = dp[i-1][j-arr[i]];
                }
                dp[i][j] = Nottake || take;
            }
        }
        return dp[arr.length-1][k];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,7,2};
        System.out.println(isPossible(arr.length-1, 200,arr));
        System.out.println(dp(arr,arr.length,200));
    }
    
}
