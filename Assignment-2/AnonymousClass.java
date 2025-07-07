interface Greeting{
    public void sayHello();
}
public class AnonymousClass {
    public static void main(String[] args) {
        Greeting ac=new Greeting() {
            public void sayHello(){
            System.out.println("This is anonymous class");
        }
    };  
    ac.sayHello();
    }
}