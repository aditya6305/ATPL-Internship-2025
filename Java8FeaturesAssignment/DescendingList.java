
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DescendingList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        Comparator<Integer> number =(a,b)->(b-a);
        numbers.sort(number);
        System.out.println(number);
    }
}
    