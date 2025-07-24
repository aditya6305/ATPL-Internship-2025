
import java.time.LocalDate;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year of birth:");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Enter the month of birth (1-12):");
        int monthOfBirth = scanner.nextInt();
        System.out.println("Enter the day of birth:");
        int dayOfBirth = scanner.nextInt();
        LocalDate birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - birthDate.getYear();
        int months= currentDate.getMonthValue() - birthDate.getMonthValue();
        int days = currentDate.getDayOfMonth() - birthDate.getDayOfMonth();
        if (days < 0) {
            months--;
            days+= birthDate.lengthOfMonth();
        }
        if (currentDate.getDayOfYear() < birthDate.getDayOfYear()) {
            System.out.println("Invalid date of birth. Please enter a valid date.");

        }
        else{
            System.out.println("Age is: " + age + " years "+months+"months "+days+"days");
        }
        scanner.close();
    }
}
    