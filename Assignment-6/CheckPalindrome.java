import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class CheckPalindrome{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        string.toLowerCase();
        char[] chararray = string.toCharArray();
        Deque<Character> deque = new LinkedList<>();
        for(int iteration = 0;iteration<chararray.length;iteration++){
            deque.add(chararray[iteration]);
        }
        boolean isPalindrome = true;
        while (deque.size()>1) {
            char startElement=deque.removeFirst();
            char lastElement=deque.removeLast();
            if(startElement!=lastElement){
                isPalindrome = false;
                break;
            }  
        }
        if(isPalindrome){
            System.out.println(string+" is a palindrome");
        }
        else{
            System.out.println(string+" is not a palindrome");
        }
        scanner.close();

}
}