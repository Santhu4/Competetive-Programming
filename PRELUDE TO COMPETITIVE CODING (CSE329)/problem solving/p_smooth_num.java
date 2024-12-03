import java.util.Scanner;

public class p_smooth_num {
    public static int fac(int n) {
        int max = Integer.MIN_VALUE;
        while (n % 2 == 0) {
            if(max<2)max = 2;
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                if(max<i)max=i;
                n /= i;
            }
        }
        if (n > 1) {
            if(max<n)max=n;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
      int max = fac(n);
      if(max<=p)System.out.println("Yes");
      else System.out.println("No");

    }
}
