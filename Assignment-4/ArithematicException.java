import java.util.Scanner;
public class ArithematicException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println("The value of a/b is:"+c);
        }
        catch(ArithmeticException e){
            System.out.println("Error is:"+e.getMessage());
        }
        finally{
            System.out.println("It Always Executed");
        }
        }
    }
