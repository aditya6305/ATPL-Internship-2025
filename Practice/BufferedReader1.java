import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {
    public static void main(String[] args) {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch = br.read();//The first character (ch) is already read and not printed or processed further.
        while (br.ready()) { //This loop runs while there is still data available in the buffer.
            System.out.println(br.readLine());
        }
    }
    catch(IOException e){
        System.out.println(""+e.getMessage());
    }
}
}
