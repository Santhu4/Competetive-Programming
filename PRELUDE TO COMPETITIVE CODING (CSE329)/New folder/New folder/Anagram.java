import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int arr[] = new int[52];
        for(int i = 0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(ch>='a' && ch<='z'){
            arr[ch-'a']++;
            }else if(ch>='A' && ch<='Z'){
                arr[ch-'A'+26]++;
            }else{
                return false;
            }
        }
        for(int i = 0;i<str2.length();i++){
            char ch = str2.charAt(i);
            if(ch>='a' && ch<='z'){
                arr[ch-'a']--;
            }else if(ch>='A' && ch<='Z'){
                arr[ch-'A'+26]--;
            }else{
                return false;
            }
        }
        for(int i = 0;i<52;i++){
            if(arr[i]!=0) return false;
        }   
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter string 2 : ");
        String str2 = sc.nextLine();
        if(isAnagram(str1,str2))
        {
            System.out.println("Given Strings are Anagrams");
        }else{
            System.out.println("Given Strings are  Not Anagrams");
        }
    }
}
