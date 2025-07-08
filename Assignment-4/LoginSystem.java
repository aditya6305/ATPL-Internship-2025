import java.util.*;
class LoginFailedException extends Exception {
    public LoginFailedException(String message){
        super(message);
    }
}
public class LoginSystem{
    public static void login(String username,String password) throws LoginFailedException{
        String oldUsername="Aditya";
        String oldPassword="A123";
        if(!username.equals(oldUsername)||!password.equals(oldPassword)){
            throw new LoginFailedException("Invalid Credentials..Not Matched with the old credentials");

        }
        System.out.println("Your are logged in successfully..");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("User name is:");
        String username=sc.nextLine();
        System.out.println("Password is:");
        String password=sc.nextLine();
        try{
            login(username, password);
        }
        catch(LoginFailedException e){
            System.out.println("Error"+e.getMessage());

        }
        sc.close();
    }
}
