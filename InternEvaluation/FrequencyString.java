import java.util.*;
public class FrequencyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string =scanner.nextLine().toLowerCase();
        char[] a = string.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char input:string.toCharArray()){
            if(map.containsKey(input)){
                map.put(input,map.get(input)+1);
            }
            else{
                map.put(input,1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }    
}
