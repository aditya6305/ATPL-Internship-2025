import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Filternames {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Tom");
        names.add("Angela");
        names.add("Steve");
        Collections.sort(names);
        for (String name : names) {
            if(name.startsWith("A")){
                System.out.print(name+" ");
            }
        }
        }
    }
