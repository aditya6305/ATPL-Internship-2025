import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.jar.Attributes.Name;
public class StudentPrintWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        PrintWriter printWriter = new PrintWriter("D:\\Assignments\\Assignment-8Day-2\\students.txt");

        for(int iterate =1;iterate<=5;iterate++){
        System.out.println("Enter the name:");
        String name = scanner.next();
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        System.out.println("Enter the department:");
        String department = scanner.next();
        System.out.println("Enter the gpa:");
        double gpa = scanner.nextDouble();
        String result = String.format("Student"+iterate+"[Name=%s,Age=%d,Department=%s,Gpa=%.2f]",name,age,department,gpa);
        System.out.println(result);
        printWriter.println(result);
        }
        printWriter.close();
    }
        catch(IOException e){
            System.out.println("Error finding the file"+e.getMessage());
        }
    }
}
