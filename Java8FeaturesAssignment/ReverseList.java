import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Cherry");
        Collections.sort(list,(s1,s2)-> s2.compareTo(s1));
        System.out.println(list);
        
    }

}
