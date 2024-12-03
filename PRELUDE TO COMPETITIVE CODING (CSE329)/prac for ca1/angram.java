public class angram {
    public static void main(String[] args) {
        String str = "rat";
        String str1 = "car";
        int arr1[] = new int[26];
        for(int i = 0;i<26;i++){
            arr1[i] = 0;
        }
        for(int i = 0;i<str.length();i++){
            arr1[str.charAt(i)-'a']++;
        }
        for(int i = 0;i<str1.length();i++){
            arr1[str1.charAt(i)-'a']--;
        }
        boolean flag = false;
        int deletions = 0;
        for(int i = 0;i<26;i++){
            if(arr1[i]!=0){
               flag = true;
                deletions+=Math.abs(arr1[i]);
                break;
            }
        }
        if(flag)
        System.out.println("Not an anagram "+deletions);
        else
        System.out.println("yes! my man its an \"anagram\"");
    }
}
