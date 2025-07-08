import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class TryWithSources{
    public static void readFile(String fileName){
        try(BufferedReader br=new BufferedReader(new FileReader(fileName))){
            String line;
            System.out.println("File Data:");
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }
            catch(IOException e){
                System.out.println("Unable read the file"+e.getMessage());
        }
    }
    public static void main(String[] args) {
        // If we know the file name then only we know the username and password in the file.
        readFile("Abc.txt");
        readFile("asdf.txt");
    }  
    
}
