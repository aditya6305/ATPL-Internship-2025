import java.io.*;
import java.util.*;
public class IOExceptionExample {
    public static void readAndDivide(String fileName) throws FileNotFoundException{
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a / b;
        System.out.println("Division Result:"+result);
    }
    public static void main(String[] args) {
        try {
            // It reads the input from the file.
            readAndDivide("Numbers.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception Caught:"+e);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught:"+e);
        }
    }
}