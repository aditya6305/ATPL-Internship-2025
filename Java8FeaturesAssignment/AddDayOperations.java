import java.time.LocalDate;
public class AddDayOperations{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Orginal Date: " + date);
        System.out.println("After adding 10 days: " + date.plusDays(10));
        LocalDate newDate = date.plusDays(10);
        System.out.println("After subtracting 2 months: " + newDate.minusMonths(2));
    }
}