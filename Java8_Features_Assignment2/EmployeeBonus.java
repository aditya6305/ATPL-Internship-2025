import java.util.*;
import java.util.function.Predicate;
class Employee {
    String name;
    double salary;
    String email;
    Employee(String name, double salary, String email) {
        this.name = name;
        this.salary = salary;
        this.email = email;
    }
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Aditya",50000,"aditya@gmail.com"),
            new Employee("Shyam",55000,null),
            new Employee("Jersha",60000,"Jerusha@gmail.com"),
            new Employee("Harika",28000,null)
        );
        Predicate<Employee> eligibleForBonus = e -> e.salary >= 40000;

        employees.stream()//This converts the list of employees into a stream.
            .filter(eligibleForBonus)//This uses the predicate to keep only those employees who are eligible for a bonus.
            .forEach(e -> {// This goes through each eligible employee.
                String emailInfo = e.getEmail().orElse("Email not available");//This returns an optional<String> containing the email or default message if it is null.
                System.out.println(e.name + " " + emailInfo);
            });
    }
}
