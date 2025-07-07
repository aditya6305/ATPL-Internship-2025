interface Movable{
    void move();
}
class Car implements Movable{
    public void move(){
        System.out.println("Car is moving");
    }

}
class Robot implements Movable{
    public void move(){
        System.out.println("Robot is automatically moved and it is controlled");
    }
}
class Drone implements Movable{
    public void move(){
        System.out.println("Drone is operated by someone");
    }
    public static void main(String[] args){
        Movable movable1=new Car();
        Movable movable2=new Robot();
        Movable movable3=new Drone();
        movable1.move();
        movable2.move();
        movable3.move();
    }
}
