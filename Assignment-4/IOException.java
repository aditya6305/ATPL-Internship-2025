// It is a Checked Exception we need to handle these exceptions.It occurs in various scenarios like File not found or if we doesnt establish connection with the other network.
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class IOException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fileName=sc.nextLine();
        try{
            FileReader fr=new FileReader(fileName);
            String line;
            BufferedReader br=new BufferedReader(fr);
        }
        catch(Exception e){
            System.out.println("Error was raised:"+e.getMessage());
        }
        finally{
            System.out.println("All code in the Final block is executed");
        }
        sc.close();
    }
}
