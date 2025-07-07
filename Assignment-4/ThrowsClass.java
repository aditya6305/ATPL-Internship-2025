import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsClass {
    public static void readFile(String fileName) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader(fileName));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
    public static void main(String[] args) {
        try{
            readFile("fileName");
        }
        catch(IOException e){
            System.out.println("Something went wrong "+e.getMessage());
        }
    }
}
