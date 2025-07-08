import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class TryCatchFileNotFound{
    public void loadFile(String fileName) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
            int data;
            while ((data = fis.read())!=-1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found:"+fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file:"+ e.getMessage());
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name:");
        String fileName=sc.nextLine();
        TryCatchFileNotFound tcf=new TryCatchFileNotFound();
        tcf.loadFile(fileName);
        sc.close();
    }
}