import java.io.Serializable;
public class students implements Serializable {
    int id;
    String name;
    int age;
    String department;
    double gpa;
    public Student(int id, String name, int age, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age +
               ", Dept: " + department + ", GPA: " + gpa;
    }
}