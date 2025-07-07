import java.util.*;
public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println("After reversing using String Builder:"+sb.toString());
    }
}
