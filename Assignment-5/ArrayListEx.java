import java.util.*;
public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of names in the list:");
        int size=sc.nextInt();
        sc.nextLine();
        ArrayList<String> names=new ArrayList<>();
        System.out.println("Enter"+size+" names into the list");
        for(int initial=0;initial<size;initial++){
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
