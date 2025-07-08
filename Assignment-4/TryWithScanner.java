import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TryWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = input.nextLine();
        int count = 0;
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                count++;
                System.out.println("Line " + count + ": " + line);
            }
            System.out.println("Total lines: " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            // If we give the input as something it will give the number of lines in .txt file and information in the file.1
        }
        input.close();
    }
}