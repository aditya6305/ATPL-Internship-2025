import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ThrowsClass {
    public static void readFile(String fileName) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader(fileName));
        String input;
        while((input=br.readLine())!=null){
            System.out.println(input);
        }
        br.close();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fileName=sc.nextLine();
        try{
            readFile("fileName");
        }
        catch(IOException e){
            System.out.println("Something went wrong "+e.getMessage());
        }
        sc.close();
    }
}
