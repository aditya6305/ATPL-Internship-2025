class Animal{
    final void eat(){
        System.out.println("Animal can eat");
    } 
}
class Lion extends Animal(){
    @Override
    void eat(){
        System.out.println("lion eats animals");
    }
}
public class AnimalFinal{
    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.eat();
    }
}