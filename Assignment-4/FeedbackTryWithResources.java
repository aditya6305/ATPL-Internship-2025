import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FeedbackTryWithResources {
    public static void scanFile(String filename) throws FileNotFoundException{
        File file=new File(filename);
        if(!file.exists()){
            System.out.println("File is not existed"+filename);
            return;
        }
        try(Scanner sc=new Scanner(file)){
            System.out.println("File Reading"+filename);
            while (sc.hasNextLine()) {
                String line=sc.nextLine();
                System.out.println(line);
            }
            }
            catch(FileNotFoundException e){
                System.out.println("Unable to open the file"+e.getMessage());
            }
        }
        public static void main(String[] args) throws FileNotFoundException{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name of the file:");
            String filename=sc.nextLine();
            scanFile(filename);
            sc.close();
    }
}