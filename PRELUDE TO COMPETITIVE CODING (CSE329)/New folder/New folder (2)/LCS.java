import java.util.*;

public class LCS {
    public static void LCSfinder(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0;i<=n;i++) dp[i][0] =  0;
        for(int j = 0;j<=m;j++) dp[0][j] = 0;
        for(int )
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
    }
}
