public class Interning {
    public static void main(String[] args) {
        String a=new String("Hello");
        //It creates a new object in heap memory.
        String b=a.intern();
        //the intern() method returns the reference from the string pool.
        String c="Hello";
        //It refers the interned string in the pool.
        System.out.println("By comparing a and b:"+(a==b));
        System.out.println("By comparing b and c:"+(b==c));
        System.out.println("By comparing a and c:"+(a==c));
    }
}
