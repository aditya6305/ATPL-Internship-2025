
import java.time.LocalDate;
import java.util.Scanner;

public class DayOfWeek{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int yearOfBirth = scanner.nextInt();
        System.out.print("Enter the month (1-12): ");
        int monthOfBirth = scanner.nextInt();
        System.out.print("Enter the day: ");
        int dayOfBirth = scanner.nextInt();
        LocalDate birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        System.out.print("The day of the week is: "+birthDate.getDayOfWeek());
        scanner.close();
    }
}