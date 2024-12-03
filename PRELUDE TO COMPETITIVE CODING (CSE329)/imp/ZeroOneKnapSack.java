public class ZeroOneKnapSack {

    public static void main(String[] args) {
        int wt[] = {3,2,1};
        int value[] = {40,50,20};
        int capacity = 5;
        int dp[][] = new int[4][capacity+1];
        for(int i = 0;i<dp.length;i++){
            dp[i][0] = 1;
        }
        for(int i = 0;i<dp[0].length;i++){
            dp[0][i] = 1;
        }
        for(int i = 1;i<dp.length;i++){
            for(int j = 1;j<dp[0].length;j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[][wt[]-j]+value[])
            }
        }
    }
}