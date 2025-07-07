class Vehicles {
    void start(){
        System.out.println("vehicle is ready to start");
    }
}
class Bike extends Vehicles{
    void start(){
        System.out.println("Bike is starting with petrol");
    }
}
class Car extends Vehicles{
    void start(){
        System.out.println("Car is starting with diesel");

    }
}
public class Vehicle{
    public static void main(String[] args) {
        Vehicles vehicle1=new Bike();
        Vehicles vehicle2=new Car();
        vehicle1.start();
        vehicle2.start();
}
}
