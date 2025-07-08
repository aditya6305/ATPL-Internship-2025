import java.util.*;
class LoginFailedException extends Exception{
    public LoginFailedException(String message){
        super(message);
    }
}
public class SystemLogin{
    public void login(String username,String password) throws LoginFailedException{
        if(!username.equals("Aditya")||!password.equals("A123")){
            throw new LoginFailedException("Invalid Credentials..Either username or password is incorrect");
        }
        System.out.println("Login Successfull..Welcome");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username:");
        String username=sc.nextLine();
        System.out.println("Enter Password:");
        String password=sc.nextLine();
        SystemLogin sl=new SystemLogin();
        try{
            sl.login(username,password);
        }
        catch(Exception e){
            System.out.println("Login failed because:"+e.getMessage());
        }
    }
}