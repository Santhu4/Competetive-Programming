// import java.util.*;
// public class pangram {
//     public static void spangram(StringBuilder sc,StringBuilder str){
//         char arr[] = str.toString().toCharArray();
//         Arrays.sort(arr);
//         String s = arr.toString();
//         int j = 0;
//         for(int i =0;i<sc.length()-1;i++){
//             if(j==s.length()){
//                 for(int k = s.length();k<sc.length();k++){
//                     System.out.print(sc.charAt(k));
//                 }
//                 break;
//             }
//             if(s.charAt(i)!=sc.charAt(j)){
//                 System.out.print(sc.charAt(i)); 
//                 j++;
//             }
//         }
//     }
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         StringBuilder str = new StringBuilder(s.toString());
//         spangram(sb,str);
//     }
// }
 

// public class pangram{
//     public static void main(String args[]){
//         String str = "abcdefghijklmnopqrstuvwxyz";
//         String n = "abcd";
//         boolean f = false;
//         for(int i = 0;i<str.length();i++){
//             for(int j =0;j<n.length();j++){
//             if(str.charAt(i)==n.charAt(i)){
//                f = true;
//             }
//         }
//         if(!f){
//             System.out.print(str.charAt(i));
//         }
//         }
//     }
// }

import java.util.*;
public class pangram {
    public static void main(String[] args) {
        boolean arr[] = new boolean[26];
        String str = "babcdkzg";
        char sarr[] = str.toCharArray();
        int j = 0;
        for(int i = 0 ;i<sarr.length;i++){
            if(sarr[i]>='a'&&sarr[i]<='z')
            arr[sarr[i]-'a'] = true;
        }
        for(int i = 0 ;i<26;i++){
            if(!arr[i])
            System.out.print((char)('a'+i));
        }
    }
}