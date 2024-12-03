import java.util.*;
public class Prime_Factors{
    public static void main(String args[]){
        int n = 16;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2;i<=Math.sqrt(n);i++){
                if(n%i == 0){
                    arr.add(i);
                    while(n%i == 0){
                        n/=i;
                    }
                }
        }
        if(n!=1) arr.add(n);
        arr.forEach(i -> System.out.println(i));
    }
}