import java.util.Optional;
import java.util.function.Supplier;
import java.util.Scanner;

public class LazyConfigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter config value:");
        String configValue = scanner.nextLine();
        if (configValue.isEmpty()) {
            configValue = null;
        }
        Optional<String> optionalConfig = Optional.ofNullable(configValue);
        Supplier<String> loadConfig = () -> {
            System.out.println("Loading default config...");
            return "Default Config";
        };
        String finalConfig = optionalConfig.orElseGet(loadConfig);
        System.out.println("Final Config: " + finalConfig);
        scanner.close();
    }
}