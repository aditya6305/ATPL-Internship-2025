class Parent{
    Parent(){
        System.out.println("This is parent class");
    }
    
}
class ChildClass extends Parent{
    ChildClass(){
        super();
        System.out.println("This is child class");
    }
}
public class ParentClass{
    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println("we are using super to call a Parent class constructor to child class");
    }
}
