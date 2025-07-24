import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class StringFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int noOfStudent= sc.nextInt();
        sc.nextLine();
        List<String> names = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();
        List<String> depts = new ArrayList<>();
        List<Double> gpas = new ArrayList<>();
        int maxNameLength = "Name".length();
        for (int iterate = 1; iterate <= noOfStudent; iterate++) {
            System.out.println("\nEnter details for Student " + iterate);
            System.out.print("Name: ");
            String name = sc.nextLine();
            names.add(name);
            maxNameLength = Math.max(maxNameLength, name.length());
            System.out.print("Age: ");
            ages.add(sc.nextInt());
            sc.nextLine();

            System.out.print("Department: ");
            depts.add(sc.nextLine());

            System.out.print("GPA: ");
            gpas.add(sc.nextDouble());
            sc.nextLine();
        }
        String format = "%-" + (maxNameLength + 2) + "s%-6s%-12s%-5s%n";
        try {
            FileWriter writer = new FileWriter("students.txt");
            writer.write(String.format(format, "Name", "Age", "Department", "GPA"));

            for (int iterate = 0; iterate < noOfStudent; iterate++) {
                writer.write(String.format(format,
                        names.get(iterate),
                        ages.get(iterate),
                        depts.get(iterate),
                        String.format("%.2f", gpas.get(iterate))
                ));
            }

            writer.close();
            System.out.println("\n Data saved to students.txt");

        } catch (IOException e) {
            System.out.println(" Error writing to file: " + e.getMessage());
        }

        sc.close();
    }
}