import java.util.*;
public class FrequencyCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int added=-1;
        for(int i=0;i<n;i++){
            if(a[i]==added){
                continue;
            }
                int count=1;
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        count++;
                        a[j]=added;
                    }
                }
            System.out.println(a[i]+" occurs "+ count+ " times");
        }
    }
}