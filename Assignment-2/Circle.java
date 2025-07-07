class Circle{
    private int radius;
    public void setRadius(int radius){
        if(radius>0){
            this.radius=radius;
        }
        else{
            System.out.println("radius should be greater than 0");
        }
    }
    public int getRadius(){
        return radius;
    }
    public double Area(){
        return Math.PI*radius*radius;
    }
    public double Circumference(){
        return 2*Math.PI*radius;
    }
    public static void main(String[] args){
        Circle circle=new Circle();
        circle.setRadius(5);
        System.out.println("Total Area of circle is:"+circle.Area());
        System.out.println("Total circumference of the circle is:"+circle.Circumference());
    }
}