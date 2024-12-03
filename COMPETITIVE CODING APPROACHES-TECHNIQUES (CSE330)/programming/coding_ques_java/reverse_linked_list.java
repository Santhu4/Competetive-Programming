class Node{
    int data;
    Node next;
    public Node(int d){
        this.data = d;
        this.next = null;
    }
}
class Linkedlist{
    Node head;
    public Linkedlist(){
        head = null;
    }
    void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    void insert_at_head(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }

    Node reverserecursively(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newnode = reverserecursively(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newnode;
    }
    void rev(){
        head = reverserecursively(head);
    }


    void reverseIteratively(){
        Node prev = null;
        Node curr = head;
        Node front = null;
        while(curr!=null){
            front = curr.next;
            curr.next = prev;
            prev = curr;    
           curr = front;
        }
        head = prev;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}
public class reverse_linked_list{
    public static void main(String args[]) {
        Linkedlist l = new Linkedlist();
        l.insert(42);
        l.insert(43);
        l.insert(44);
        l.insert(45);
        l.insert(46);
        l.insert(47);
        l.insert(48);
        //l.display();
        l.insert_at_head(99);
        l.insert_at_head(98);
         l.display();
       // l.rev();
       l.reverseIteratively();
        System.out.println();
        l.display();
    }
}