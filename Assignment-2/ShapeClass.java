//11.2 Create an abstract class Shape with method draw(). Use an anonymous class
to provide its implementation and call draw()
abstract class Shape{
    abstract void draw();
}
public class ShapeClass {
    public static void main(String[] args) {
        Shape s=new Shape() {
            void draw(){
                System.out.println("Shapes are drawn here");
            }
        };
        s.draw();
    }
}
