import java.util.*;
public class InsertPosition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        int position=sc.nextInt();
        int[] b=new int[a.length+1];
        for(int i=0;i<position;i++){
            b[i]=a[i];
        }
        b[position]=element;
        for(int i=position;i<a.length;i++){
            b[i+1]=a[i];
        }
        System.out.println("updated array: "+Arrays.toString(b));
    }
}
