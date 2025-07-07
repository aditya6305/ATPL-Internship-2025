abstract class Appliance{
    abstract void turnOn();
    abstract void turnOff();
}
class Fan extends Appliance{
    void turnOn(){
        System.out.println("Fan is rotating");
    }
    void turnOff(){
        System.out.println("Fan is off");
    }
}
class Tv extends Appliance{
    void turnOn(){
        System.out.println("Tv is on");
    }
    void turnOff(){
        System.out.println("Tv is off");
    }
public static void main(String[] args){
    Appliance appliance1=new Fan();
    Appliance appliance2=new Tv();
    appliance1.turnOn();
    appliance1.turnOff();
    appliance2.turnOn();
    appliance2.turnOff();
}
}