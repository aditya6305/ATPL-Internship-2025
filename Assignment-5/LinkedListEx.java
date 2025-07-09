import java.util.*;
public class LinkedListEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in the list");
        int size=sc.nextInt();
        LinkedList<Integer> ll=new LinkedList<>();
        for(int initial=0;initial<size;initial++){
            ll.add(sc.nextInt());
    }
    ll.addFirst(5);
    ll.addLast(60);
    System.out.println(ll);
    ll.remove(2);
    System.out.println("After removing 2nd index element from the linked list..");
    System.out.println(ll);
}
}
