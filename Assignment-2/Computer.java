class System1{
    String company;
    String processor;
    System1(){
        System.out.println("Hello");
    }
    System1(String company){
        this();
        System.out.println("Everyone!");
    }
}
public class Computer{
    public static void main(String[] args){
        System1 sys=new System1("Hp");
    }
}