import java.util.*;
public class ReverseAString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        if(s.length()<2){
            System.out.println("Your String has only single Character");

        }
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println("After reversing the string is: "+rev);
    }
}