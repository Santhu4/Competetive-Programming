// import java.util.*;
// public class min_ele_in_stack{
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
// Stack<Integer> s = new Stack<>();
// Stack<Integer> mins = new Stack<>();
// int ch = 0;
// int min = Integer.MAX_VALUE;
// do{
//     System.out.println("1.push");
//     System.out.println("2.Pop");
//     System.out.println("3.exit");
// ch = sc.nextInt();
// switch(ch){
//     case 1:
//         System.out.print("Enter the ele to push into Stack: ");
//         int ele  = sc.nextInt();
//         if(ele<min){
//             min = ele;
//         }
//             s.push(ele);
//             mins.push(min);
//         break;
//     case 2:
//         System.out.println("Popped Element is : "+s.pop());
//         System.out.println("Minimum Element is : "+mins.pop());
//         break;
//     case 3:
//         break;
//     default:
//         System.out.println("Invalid");
// }
// }while(ch!=3);
// }
// }



import java.util.*;

public class min_ele_in_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int ch = 0;
        int min = Integer.MAX_VALUE;
        
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            ch = sc.nextInt();
            
            switch (ch) {
                case 1:
                    System.out.print("Enter the element to push into Stack: ");
                    int ele = sc.nextInt();
                    
                    // Push the current min value before pushing the new element
                    if (ele <= min) {
                        s.push(min);  // Store the previous min
                        min = ele;    // Update the new min
                    }
                    s.push(ele);      // Push the actual element
                    System.out.println("Pushed: " + ele);
                    System.out.println(s);
                    break;
                    
                case 2:
                    if (s.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        int top = s.pop();
                        if (top == min) {
                            min = s.pop();  // Restore the previous min value
                        }
                        System.out.println("Popped element is: " + top);
                        System.out.println(s);
                    }
                    break;
                    
                case 3:
                    break;
                    
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (ch != 3);
    }
}


