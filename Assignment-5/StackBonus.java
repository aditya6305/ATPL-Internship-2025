import java.util.*;
public class StackBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements insert into the stack:");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<n;i++){
            st.add(sc.nextInt());
        }
        //Here we are pushing n elements one after the other.Like for example i insertedd 1-5 numbers in an order
        System.out.println(st);// It shows output like this [1, 2, 3, 4, 5]
        //perform pop after this
        System.out.println("Enter the how many times to pop the stack");
        int pop=sc.nextInt();
        for(int i=0;i<pop;i++){
            st.pop();
        }
        System.out.println("After perform pop operation"+pop+"Times we got:"+st);
        //After performing pop for 2 times we got [1, 2, 3] but we insert the elements 1-5 in an order but it pops the last 2 elements 
        // So stack follows LIFO principle.
    }
}
