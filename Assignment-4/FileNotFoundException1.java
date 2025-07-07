import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundException1{
    public static void main(String[] args) {
        FileReader fr=null;
        // FileReader fr=new FileReader("Abc.txt");
        try{
            fr=new FileReader("Abc.txt");
            System.out.println("File is found");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
    }
}
