package B;
import A.ClassA;
public class ClassB extends ClassA{
    protected void protMethod() {
        protMethod();
    }
    public static void main(String[] args){
        ClassB cb=new ClassB();
        cb.protMethod();
    }
}
