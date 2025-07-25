import java.util.*;
import java.util.function.Function;
class User {
    public String name;
    public String email;
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
public class UserSearch {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
            new User("Aditya", "aditya@aaslin.com"),
            new User("Harika", "Harika@aaslin.com"),
            new User("Jerusha", "Jerusha@aaslin.com")
        );
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine();
        Optional<User> user = users.stream()
            .filter(u -> u.name.equalsIgnoreCase(searchName))
            .findFirst();
        Function<String, String> toUpperCase = String::toUpperCase;
        user.map(u -> u.email)
               .map(toUpperCase)
               .ifPresent(System.out::println);
        if (user.isPresent()) {
            System.out.println(user.get());
        } else {
            System.out.println("User not found");
        }
        scanner.close();
    }
}
