import java.util.*;
public class next_happy_number{
    public static int sumofsquare(int n){
        int sum = 0;
        while (n>0) {
            int rem = n%10;
            sum += (rem*rem);
            n/=10;
        }
        return sum;
    }
    public static boolean isHappy(int n){
        int first = n;
        int last = n;
        do{
            first = sumofsquare(first);
            last = sumofsquare(sumofsquare(last));
        }while(first!=last);
        return (first == 1);
    }
    public static int Next_Happy_num(int n){
        n++;
        while(!isHappy(n)){
            n++;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int n = sc.nextInt();
        int nexthappynumber = Next_Happy_num(n);
        System.out.println("The Next happy Number is : "+nexthappynumber);
    }
}






// #include<iostream>
// using namespace std;
// int sumofsquare(int n)
// {
//     int sum=0;
//     while(n>0)
//     {
//         int digit=n%10;
//         sum+=digit * digit;
//         n/=10;
//     }
//     return sum;
// }
// bool isHappy(int n)
// {
//     int first=n;
//     int last=n;
//     do{
//         first=sumofsquare(first);
//         last=sumofsquare(sumofsquare(last));
//     }
//     while(first!=last);
//     return first==1;
// }
// int nextHappyNumber(int n)
// {
//     int number=n+1;
//     while(!isHappy(number))
//     {
//         number++;
//     }
//     return number;
// }
// int main()
// {
//     int x;
//     cout<<"Enter the number";
//     cin>>x;
//     int nexthappynumber=nextHappyNumber(x);
//     cout<<"The next happy number after x is" <<nexthappynumber;
// }
