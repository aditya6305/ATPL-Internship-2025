import java.util.*;
public class ValidNumber {
    public static void checkPositive(int num){
        if(num<0){
            throw new IllegalArgumentException("Number cannot be negative");
        }
        else{
            System.out.println(num+" is Valid number");
        }
    }
    public static void main(String[] args) {
        checkPositive(10);
        checkPositive(-5);
    }
}