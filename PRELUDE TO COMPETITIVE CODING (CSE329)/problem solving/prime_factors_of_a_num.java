import java.util.Scanner;

public class prime_factors_of_a_num{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n%2==0){
            System.out.println(2);
            n/=2;
        }
        for(int i = 3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
}