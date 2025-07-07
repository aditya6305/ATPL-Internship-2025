package Access_Modifiers.A;

public class Main {
    public static void main(String[] args) {
       DeclareClass dc=new DeclareClass();
       System.out.println("Public variable:" +dc.a);
    //    System.out.println("Private variable:" +dc.b);
       System.out.println("Protected variable:" +dc.c);
       System.out.println("Default variable:" +dc.d);

    }
}
