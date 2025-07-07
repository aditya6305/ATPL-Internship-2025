import java.util.*;
public class SortStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] names=new String[5];
        for(int i=0;i<names.length;i++){
            names[i]=sc.nextLine();
        }
        Arrays.sort(names);
        System.out.println("names in Ascending order:");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println("names in Descending order:");
        for(int i=names.length-1;i>=0;i--){
            System.err.println(names[i]);
        }
    }
}
