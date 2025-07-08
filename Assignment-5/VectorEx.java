import java.util.*;
public class VectorEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of values add into the vector");
        int n=sc.nextInt();
        Vector<Double> v=new Vector<>();
        for(int i=0;i<n;i++){
            v.add(sc.nextDouble());
        }
        Enumeration<Double> e=v.elements();
        System.out.println("Elements in the vector are:");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        }
    }
