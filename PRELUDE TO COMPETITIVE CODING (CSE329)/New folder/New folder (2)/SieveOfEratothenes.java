import java.util.Scanner;

public class SieveOfEratothenes{
    public static void sieve(int n){
        boolean arr[] = new boolean[n+1];
        for(int i = 2;i*i<=n;i++){
            if(!arr[i]){
                for(int j = i*i;j<=n;j+=i){
                    arr[j] = true;
                }
            }
        }
        for(int i = 2;i<=n;i++){
            if(!arr[i]) System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sieve(n);
    }
}