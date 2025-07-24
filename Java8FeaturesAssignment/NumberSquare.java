import java.util.ArrayList;
import java.util.List;

public class NumberSquare{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=1;i<=5;i++){
            numbers.add(i);
        }
        numbers.forEach(number->{number = number * number;System.out.print(number);});
        
    }
}