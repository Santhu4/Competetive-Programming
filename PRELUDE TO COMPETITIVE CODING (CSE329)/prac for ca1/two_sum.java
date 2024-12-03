import java.util.*;
public class two_sum {
    public static void main(String[] args) {
        int arr[] =  {-1,-2,19,24,62,2,-3,-4,5,-6,-7,23,1,1,1};
        int tar = 3;
        Arrays.sort(arr);
        int l = 0,r = arr.length-1;
        boolean flag = false;
        while (l<r) {
            if(arr[l]+arr[r] == tar){
                System.out.println("found "+arr[l]+" "+arr[r]);
                flag = true;
                break;
            }
            if(tar >arr[l]+arr[r])
            {
                l++;
            }else{
                r--;
            }
        }
        if(!flag){
            System.out.println("Not Found \"My Man\" Dammn!!");
        }
    }
}
