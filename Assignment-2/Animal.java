class Animals{
    void makeSound(){
        System.out.println("Animals sounds");
    }
}
class Dog extends Animals{
    void makeSound(){
        System.out.println("Dog sounds bow bow");
    }
}
class Cat extends Animals{
    void makeSound(){
        System.out.println("Cat Sounds meoww meoww");
    }
}
class Cow extends Animals{
    void makeSound(){
        System.out.println("cow is mooing");
    }
}
public class Animal{
    public static void main(String[] args){
        Animals animal1=new Dog();
        Animals animal2=new Cat();
        Animals animal3=new Cow();
        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();

    }
}