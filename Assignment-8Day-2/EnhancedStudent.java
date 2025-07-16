import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.jar.Attributes.Name;
public class EnhancedStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        PrintWriter printWriter = new PrintWriter("D:\\Assignments\\Assignment-8Day-2\\students.txt");
        printWriter.printf("%-30s%-10s%-16s%-10s%n","Name","Age","Department","Gpa");
        for(int iterate =1;iterate<=5;iterate++){
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        System.out.println("Enter the department:");
        String department = scanner.next();
        System.out.println("Enter the gpa:");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        String message = String.format("%-30s%-10s%-16s%-10s%n",name,age,department,gpa);
        printWriter.println(message);
        }
        printWriter.close();
    }
        catch(IOException e){
            System.out.println("Error finding the file"+e.getMessage());
        }
    }
}
