// import java.util.*;
// public class Primeuptosquareroot{
//     public static void printPrimeFactors(int n){
//         for(int i =1;i<Math.sqrt(n);i++){
//             int z = 0;
//             if(n%i==0){
//                  z = n/i;
//                 if(isprime(z)&&isprime(i))
//                 {
//                     System.out.println(z+", "+i);
//                 }
//         }
//     }
//     }
//     // public static int rev(int n){
//     //     int rev = 0;
//     //     while(n>0){
//     //         rev = (rev * 10) + (n % 10);
//     //         n/=10;
//     //     }
//     //     return rev;
//     // }
//     public static boolean isprime(int n){
//         boolean flag = true;
//         for(int i = 2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 flag = false;
//                 return false;
//             }
//         }
//         return true;
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     // int rev = rev(n);
//     // if(isprime(n)){
//     //     System.out.println("Yes "+n+" is a prime number");
//     // }else{
//     //     System.out.println("No "+n+"is not a prime Number");
//     // }
//     // if(isprime(rev)){
//     //     System.out.println("Yes "+rev+" is a prime number");
//     // }else{
//     //     System.out.println("No "+rev+"is not a prime Number");
//     // }
//     printPrimeFactors(n);
// }
// }




// // public class Primeuptosquareroot {
   
// //     public static void main(String[] args) {
// //         int n = 32;
// //         printPrimeFactors(n);
// //     }
// // }



// public class Primeuptosquareroot {
//     public static void findNearestPrime(int n){
//         int x = 0;
//         int y = 0;
//         int i = n-1;
//         int j = 2;
//             while(true){
//             if(isprime(i)){
//                 x = i;
//             }
//             if(isprime(i)){
//                 y = j;
//             }
//             if(x+y==n){
//                 System.out.println(x+","+y);
//                 break;
//             }else{
//                 i--;
//                 j++;
//             }
//         }
//     }
//         public static boolean isprime(int n){
//         boolean flag = true;
//         for(int i = 2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 flag = false;
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int n = 74;
//         findNearestPrime(n);
//     }
// }



public class Primeuptosquareroot {
    public static void findNearestPrime(int n) {
        int x = 0;
        int y = 0;
        int i = n - 1;
        int j = 2;

        while (i >= 2 && j < n) {
            if (isprime(i) && isprime(j) && i + j == n) {
                x = i;
                y = j;
                System.out.println(x + ", " + y);
                return; // Exit after finding the first valid pair
            }
            // Adjust i and j to explore different combinations
            i--;
            j++;
        }
        
        // If no valid pair is found
        System.out.println("No prime pairs found.");
    }

    public static boolean isprime(int n) {
        if (n <= 1) return false; // Handle edge cases
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 74;
        findNearestPrime(n);
    }
}
