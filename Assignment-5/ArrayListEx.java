import java.util.*;
public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of names in the list:");
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> names=new ArrayList<>();
        System.out.println("Enter"+n+" names into the list");
        for(int i=0;i<n;i++){
            names.add(sc.nextLine());
        }
        System.out.println("The names in your list are:");
        for(String name:names){
            System.out.println(name);
        }
        System.out.println(names);
        System.out.println("Enter element index to remove:");
        int remove=sc.nextInt();
        names.remove(2);
        System.out.println(names);
    }
}
