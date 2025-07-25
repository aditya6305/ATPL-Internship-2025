import java.util.*;
import java.util.function.Consumer;
class Customer {
    String name;
    boolean subscribed;
    Customer(String name, boolean subscribed) {
        this.name = name;
        this.subscribed = subscribed;
    }
}
public class CustomerNotification {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
            new Customer("Aditya", true),
            new Customer("Harika", false),
            new Customer("Jerusha", true));
        Consumer<Customer> notify = c ->System.out.println("Notification sent to: " + c.name);
        customers.stream().filter(c -> c.subscribed).forEach(notify);
    }
}
