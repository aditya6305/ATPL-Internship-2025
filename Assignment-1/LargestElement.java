import java.util.*;
public class LargestElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int max=a[0];
        int n=a.length;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The largest element in the array: "+max);
    }
}
