import java.util.ArrayList;
import java.util.Collections;

public class MaximumRope {
    public static void main(String[] args) {
        int ar[] = {4,3,2,7,9};
        int cost = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i: ar)
        {
            arr.add(i);
        }
        while(arr.size()>1){
            Collections.sort(arr);
            int num = arr.get(0)+arr.get(1);
            cost+=num;
            arr.remove(0);
            arr.remove(0);
            arr.add(num);
        }
        System.out.println(cost);
    }
}
