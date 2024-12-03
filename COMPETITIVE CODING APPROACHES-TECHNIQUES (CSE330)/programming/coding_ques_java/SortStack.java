import java.util.*;
public class SortStack{
    
    public static void order(Stack<Integer> s,int x){
        if(s.isEmpty() || x>=s.peek()){
            s.push(x);
            return;
        }
        int num = s.pop();
        order(s,x);
        s.push(num);

    }
    public static void sort(Stack<Integer> s){
        
        if(!s.isEmpty()){
            int x = s.pop();
           sort(s);
           order(s,x);
        }
        
    }
    public static void main(String args[]){
     Stack<Integer> s = new Stack<>();
        s.add(24);
        s.add(12);
        s.add(14);
        s.add(32);
        s.add(4);
        sort(s);
        System.out.println(s);
    }
}