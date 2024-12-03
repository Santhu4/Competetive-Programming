import java.util.*;
class task implements Comparable<task>{
    char id;
    int deadline;
    int profit;
    public task(char ch,int dead,int pro){
        id = ch;
        deadline = dead;
        profit = pro;
    }
    @Override
    public String toString() {
        return "task [id=" + id + ", deadline=" + deadline + ", profit=" + profit + "]"+"\n";
    }

    @Override
    public int compareTo(task obj){
        if(this.profit<obj.profit){
            return 1;
        }
        else return -1;
    }

}
public class maxinum_profit_greedy {
    public static void main(String[] args) {
        ArrayList<task> obj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            char ch = sc.next().charAt(0);
            int dead = sc.nextInt();
            int pro = sc.nextInt();
        obj.add(new task(ch,dead,pro));
    }
    Collections.sort(obj);
}
}
