import java.util.*;
public class VectorEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of values add into the vector");
        int size=sc.nextInt();
        Vector<Double> vector=new Vector<>();
        for(int inital=0;inital<size;inital++){
            vector.add(sc.nextDouble());
        }
        Enumeration<Double> enumeration=vector.elements();
        System.out.println("Elements in the vector are:");
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        sc.close();
        }
    }