import java.util.Scanner;
public class LCS{
    public static int lcs(String str1,String str2){
    int m = str1.length();
    int n = str2.length();

    int dp[][] = new int[m+1][n+1];

    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                dp[i][j]=dp[i-1][j-1]+1;
            }else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    }
    return dp[m][n];

}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the 2nd String : ");
        String str2 = sc.nextLine();
        int LCS = lcs(str1,str2);
        System.out.println("The Length of Longest Common Subsequence between "+str1+" and "+str2+" is : "+LCS);
        
    }
}