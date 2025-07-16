import java.io.*;
import java.util.*;
public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        System.out.println("Enter details for 5 students:\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Student " + i);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();
            System.out.print("GPA: ");
            double gpa = sc.nextDouble();

            Student s = new Student(id, name, age, dept, gpa);
            studentList.add(s);
            System.out.println();
        }

        try {
            FileOutputStream fos = new FileOutputStream("students.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
            fos.close();
            System.out.println("Students serialized to students.ser\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("students.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Deserialized Students:\n");
            for (Student s : students) {
                System.out.println(s);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}