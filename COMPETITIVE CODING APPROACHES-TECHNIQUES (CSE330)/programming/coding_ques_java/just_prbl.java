class stack{
    int max;
    int arr[];
    int top;
    public stack(){
        max = 6;
        arr = new int[max];
        top = -1;
    }
    boolean isFull(){
        return top == max-1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    void push(int ele){
        if(isFull()){
            System.out.println("overflow");
        }else{
        arr[++top] =  ele;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("underflow");
            return -1;
        }else{
            int val = arr[--top];
            return val;
        }
    } 
    void display(){
        for(int i = top;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
}
public class just_prbl {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.display();
    }
}
