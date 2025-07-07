import java.util.*;
public class CountEvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[6];
        int evencount=0,oddcount=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.print("even count:"+evencount+",");
        System.out.println("odd count:"+oddcount);
    }
}