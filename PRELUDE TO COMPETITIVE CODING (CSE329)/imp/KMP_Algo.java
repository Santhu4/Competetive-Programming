import java.util.*;

public class KMP_Algo {
    
    // Brute force approach to find all occurrences of pattern in text
    public static ArrayList<Integer> bruteForce(String str1, String str2) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        if (str2.length() == 0) {
            // Edge case: str2 is empty
            for (int i = 0; i < str1.length(); i++) {
                arr.add(i);
            }
            return arr;
        }
        
        int i = 0; // Index for str1
        int n = str1.length();
        int m = str2.length();

        while (i <= n - m) { // Ensure enough space for str2 to match in str1
            int j = 0; // Index for str2

            // Compare str1 and str2 characters
            while (j < m && str1.charAt(i + j) == str2.charAt(j)) {
                j++;
            }

            // If we reached the end of str2, we found a match
            if (j == m) {
                arr.add(i);
            }

            // Move to the next position in str1
            i++;
        }

        return arr;
    }

    // KMP algorithm to find all occurrences of pattern in text
    public static ArrayList<Integer> kmp(String str1, String str2) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(str1.length()<str2.length()) return arr;
        int n = str1.length();
        int m = str2.length();
        int lps[] = new int[m];
        int i = 1,j = 0;
   
        while(i<m){
           if(str2.charAt(i) == str2.charAt(j)){
               lps[i] = j+1;
               i++;
               j++;
           }else if(j == 0 && str2.charAt(i) != str2.charAt(j)){
               lps[i] = 0;
               i++;
           }else{
               j = lps[j-1];
           }
        }
   
        i = 0;
        j = 0;
        while(i<n){
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
                j++;
            }
            
           if(j == m){
               arr.add(i - j);
               j = lps[j - 1];
           }else if(i<n && str1.charAt(i) != str2.charAt(j))
           {
                if(j!=0)
                {
                j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
    return arr;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();
        
        ArrayList<Integer> bru = bruteForce(str1, str2);
        ArrayList<Integer> kmp = kmp(str1, str2);
        
        // Display results for brute force
        System.out.println("Occurrences of '" + str2 + "' in '" + str1 + "' using bruteForce:");
        bru.forEach(System.out::println);
        
        // Display results for KMP algorithm
        System.out.println("Occurrences of '" + str2 + "' in '" + str1 + "' using KMP algorithm:");
        kmp.forEach(System.out::println);
    }
}
