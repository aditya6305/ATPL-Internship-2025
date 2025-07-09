import java.util.*;
public class StackBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements insert into the stack:");
        int size=sc.nextInt();
        Stack<Integer> stack=new Stack<>();
        System.out.println("Enter "+size+" Elements");
        for(int initial=0;initial<size;initial++){
            stack.add(sc.nextInt());
        }
        //Here we are pushing n elements one after the other.Like for example i insertedd 1-5 numbers in an order
        System.out.println(stack);// It shows output like this [1, 2, 3, 4, 5]
        //perform pop after this
        System.out.println("Enter the how many times to pop the stack");
        int pop=sc.nextInt();
        for(int i=0;i<pop;i++){
            stack.pop();
        }
        System.out.println("After perform pop operation"+pop+"Times we got:"+stack);
        //After performing pop for 2 times we got [1, 2, 3] but we insert the elements 1-5 in an order but it pops the last 2 elements 
        // So stack follows LIFO principle.
    }
}
