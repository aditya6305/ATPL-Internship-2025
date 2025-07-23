import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenList{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=1;i<=10;i++){
            arrayList.add(i);
        }
        arrayList.forEach(num ->{if(num%2==0)System.out.print(num+" ");});

    }
}