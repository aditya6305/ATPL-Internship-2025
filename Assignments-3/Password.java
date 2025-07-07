import java.util.*;
public class Password {
    public static String encrypt(String password){
       char[] c=password.toCharArray();
       for(int i=0;i<c.length;i++){
        c[i]=(char)(c[i]+13);
       }
       return new String(c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String origpass=sc.nextLine();
        String encrypass=encrypt(origpass);
        System.out.println("Original password:"+origpass);
        System.out.println("Encrypted Password:"+encrypass);
    }
}
