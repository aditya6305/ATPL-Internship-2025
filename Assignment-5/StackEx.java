import java.util.*;
public class StackEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements to push:");
        int n=sc.nextInt();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        System.out.println("Stack After pushing "+n+" Elements into it:"+s);
        System.out.println("Enter how many elements to be popped:");
        int pop=sc.nextInt();
        for(int i=0;i<pop;i++){
            s.pop();
        }
        System.out.println(s);  
    }
}
