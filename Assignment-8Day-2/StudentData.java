import java.io.*;
import java.text.MessageFormat;
import java.util.*;

class students implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    int age;
    String department;
    double gpa;
    public students(int id, String name, int age, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.gpa = gpa;
    }
}

public class StudentData {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("students.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("== Student List (String.format) ==");
            for (Students s : students) {
                String output = String.format("ID: %d, Name: %s, Age: %d, Dept: %s, GPA: %.2f",
                                              s.id, s.name, s.age, s.department, s.gpa);
                System.out.println(output);
            }
            System.out.println("\n== Student List (MessageFormat) ==");
            String pattern = "ID: {0}, Name: {1}, Age: {2}, Dept: {3}, GPA: {4}";
            for (Students s : students) {
                String msg = MessageFormat.format(pattern, s.id, s.name, s.age, s.department, s.gpa);
                System.out.println(msg);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}