public class Anagram {
    public static void checkIfAnagram(String str1,String str2){
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int arr[] = new int[26];
        for(int i =0;i<arr1.length;i++){
            arr[arr1[i]-'a']++; 
        }
        for(int i =0;i<arr2.length;i++){
            arr[arr2[i]-'a']--; 
        }
        boolean flag = true;
        int sum = 0;
        for(int i = 0;i<26;i++){
            if(arr[i]!=0){
                flag = false;
                sum+=Math.abs(arr[i]);
            }
        }
        if(!flag){
            System.out.println("It's not a valid Anagram Minimum deletions required To make an Anagram are : "+sum);
        }else{
            System.out.println("It's a valid Anagram");
        }
    }
public static void main(String[] str){
        String str1  = "rat";
        String str2 = "car";
        checkIfAnagram(str1,str2);
    }
    
}
