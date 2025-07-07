abstract class Shape{
    abstract double area();
}
class Square extends Shape{
    double side;
    Square(double side) {
        this.side=side;
    }
    double area(){
        return side*side;
    }
}
class Triangle extends Shape{
    double base;
    double height;
    Triangle(double base,double height) {
        this.base=base;
        this.height=height;
    }
    double area(){
        return 0.5*base*height;
    }
}
public class ShapesClass{
    public static void main(String[] args) {
        Shape shape1=new Square(10);
        Shape shape2=new Triangle(20,10);
        System.out.println("Square Area: "+shape1.area());
        System.out.println("Triangle Area: "+shape2.area());
    }
}