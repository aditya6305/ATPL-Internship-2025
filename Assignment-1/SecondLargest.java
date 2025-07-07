import java.util.*;
public class SecondLargest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int largest=a[0];
       for(int i=1;i<n;i++){
           if(a[i]>largest){
               largest=a[i];
           }
       }
       int secondlar=a[0];
       for(int i=0;i<n;i++){
           if(a[i]!=largest && a[i]>secondlar){
               secondlar=a[i];
           }
       }
       if(secondlar==largest){
           System.out.println("there is only single element");
       }
       else{
           System.out.println("second largest element is:"+secondlar);
       }
    }
}