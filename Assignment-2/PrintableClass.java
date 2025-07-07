interface Print {
    void printit();
} 
class Document implements Print{
    public void printit(){
        System.out.println("Print the document");
    }
}
class Image implements Print{
    public void printit(){
        System.out.println("Print the image");
    }
}
class Invoice implements Print{
    public void printit(){
        System.out.println("print the invoice");
    }
}
public class PrintableClass{
    public static void main(String[] args) {
        Print print1=new Document();
        Print print2=new Image();
        Print print3=new Invoice();
        print1.printit();
        print2.printit();
        print3.printit();
    }
}
