import java.text.MessageFormat;
import java.util.*;
public class ParameterizedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of students:");
        int noOfStudents = scanner.nextInt();
        for(int iterate = 0; iterate<noOfStudents;iterate++){
            System.out.println("Enter student id:");
            int id = scanner.nextInt();
            System.out.println("Enter student name:");
            String name =scanner.next();
            System.out.println("Enter student department:");
            String department = scanner.next();
            System.out.println("Enter gpa of the student");
            double gpa = scanner.nextDouble();
            String message = MessageFormat.format("Student {0} from {1} department has secured a GPA of {2}.",name,department,gpa);
            System.out.println(message);
        }
    }
}
