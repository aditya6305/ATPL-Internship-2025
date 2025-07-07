class Vehicle{
    final int speed=30;
    void changeSpeed(){
        // compile time error
        //error: cannot assign a value to final variable speed.
        speed=50;
    }
}
public class VehicleFinal{
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        System.out.println("Speed of the vehicle is "+vehicle.speed);
        vehicle.changeSpeed();
    }
}
