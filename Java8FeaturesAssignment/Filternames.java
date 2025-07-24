import java.util.ArrayList;
import java.util.List;

public class FilterNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Tom");
        names.add("Angela");
        names.add("Steve");
        names.forEach(name ->{if(name.charAt(0)=='A'){System.out.println(name+" ");}});
    }
}