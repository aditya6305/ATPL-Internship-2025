public class Mathutils {
    int calculate(int a,int b){
        return a+b;
    }
    double calculate(double a,double b){
        return a*b;
    }
    public static void main(String[] args) {
        Mathutils math=new Mathutils();
        System.out.println("Addition of a and b is:" +math.calculate(1,2));
        System.out.println("Multiplication of a and b is:" +math.calculate(3.0,4.0));
    }
}
