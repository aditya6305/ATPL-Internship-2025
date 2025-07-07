public class Laptop {
    String brand;
    int ram;
    String processor;
    Laptop(String brand,int ram,String processor){
        this.brand=brand;
        this.ram=ram;
        this.processor=processor;
    }
    Laptop(String brand,int ram){
        this.brand=brand;
        this.ram=ram;
        this.processor="i5";
    }
    Laptop(String processor){
        this.brand="Lenovo";
        this.ram=16;
        this.processor=processor;
    }
    void show(){
        System.out.println("Brand:"+brand+" Ram:"+ram+" Processor:"+processor);
    }
    public static void main(String[] args) {
        Laptop laptop1=new Laptop("Hp",8,"i5");
        Laptop laptop2=new Laptop("MacBook", 5);
        Laptop laptop3=new Laptop("i9");
        laptop1.show();
        laptop2.show();
        laptop3.show();

    }
}
