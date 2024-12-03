class node{
    int data;
    node next;
    public node(int data){
        this.data = data;
        next = null;
    }
}
class linkedlist{
    node head;
    node cycle;
     void insert(int data){
         node newNode = new node(data);
         if(head == null){
             head = newNode;
             return;
         }
         newNode.next = head;
         head = newNode;
         return;
     }
     void create_cycle(){
         node temp = head;
         int cnt = 0;

         while(temp != null){
             temp = temp.next;
             cnt++;
             if(cnt == 3){
                 cycle = temp;
             }
             if(temp.next==null){
                 temp.next = cycle;
                 return;
             }
         }
     }

     void display(){
         node temp = head;
         while(temp != null){
             System.out.print(temp.data+" ");
             temp = temp.next;
         }
     }
}


public class find_cycle_in_linkedlist {
    public static void main(String[] args) {
        linkedlist obj = new linkedlist();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
         obj.create_cycle();
        obj.display();
    }
}
