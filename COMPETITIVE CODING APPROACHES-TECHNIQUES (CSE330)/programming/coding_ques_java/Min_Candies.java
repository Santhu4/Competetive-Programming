import java.util.Arrays;
public class Min_Candies {
 public static void main(String args[]){
    int arr[] = {1,2,3,4,5,2,1};
    int c[] = new int[arr.length];
    Arrays.fill(c,1);
    for(int i = 1;i<c.length;i++){
        if(arr[i]>arr[i-1]){
            c[i] = c[i-1]+1;
        }
    }
    for(int i = arr.length-2;i>=0;i--){
        if(arr[i]>arr[i+1]){
            c[i] = Math.max(c[i],1+c[i+1]);
        }
    }
    for(int i : c){
        System.out.print(i+" ");
    }
 }
}
