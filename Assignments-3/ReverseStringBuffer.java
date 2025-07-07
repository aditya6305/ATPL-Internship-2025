import java.util.*;
public class ReverseStringBuffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        System.out.println("After reversing the string using string buffer: "+sb.toString());
       }
}
