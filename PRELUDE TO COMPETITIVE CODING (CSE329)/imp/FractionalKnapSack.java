import java.util.ArrayList;
import java.util.Collections;

class Mix implements Comparable<Mix>{
    int item;
    int weight;
    int val;
    float vbw;
    public Mix(int item, int weight, int val) {
        this.item = item;
        this.weight = weight;
        this.val = val;
        this.vbw = ((float)this.val/(float)this.weight);
    }

    public int compareTo(Mix obj){
        if(this.vbw<obj.vbw)
        return 1;
        else
        return -1;
    }

    @Override
    public String toString() {
        return "Mix [item=" + item + ", weight=" + weight + ", val=" + val + ", vbw=" + vbw + "]"+"\n";
    }

    
}
public class FractionalKnapSack {
    public static void main(String[] args) {
    ArrayList<Mix> obj = new ArrayList();
        int max = 50;
        obj.add(new Mix(1,10,50));
        obj.add(new Mix(2,20,70));
        obj.add(new Mix(3,30,90));
    Collections.sort(obj);

    int sum = 0;
    for(int i = 0;i<3;i++){  
        if(obj.get(i).weight<=max)
        {
    sum+=obj.get(i).val;
    max-= obj.get(i).weight;
    }else{
        sum+=(obj.get(i).vbw)*max;
    }
    }
    System.out.println(sum);
}
}
