public class pangram {
    public static void main(String[] args) {
        String str = "tksanthoshrao";
        boolean arr[] = new boolean[26];
        for(int i = 0;i<26;i++){
            arr[i] = false;
        }
        for(int i = 0;i<str.length();i++){
            int index = str.charAt(i)-'a';
            arr[index] = true;
        }
        for(int i = 0;i<26;i++){
            if(!arr[i]){
                System.out.print((char)(i+'a')+" ");
            }
        }
    }
}
