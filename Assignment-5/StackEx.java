import java.util.*;
public class StackEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements to push:");
        int size=sc.nextInt();
        Stack<Integer> stack=new Stack<>();
        for(int initial=0;initial<size;initial++){
            stack.push(sc.nextInt());
        }
        System.out.println("Stack After pushing "+size+" Elements into it:"+stack);
        System.out.println("Enter how many elements to be popped:");
        int pop=sc.nextInt();
        for(int inital=0;inital<pop;inital++){
            stack.pop();
        }
        System.out.println(stack);  
        sc.close();
    }
}
