import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String string =scanner.nextLine();
       String output ="";
       for(int iterate=string.length()-1;iterate>=0;iterate--){
        output+=string.charAt(iterate);
       }
       System.out.println(output);
}
}
