import java.util.HashSet;
import java.util.Scanner;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] words = string.split("\\W+");
        HashSet<String> unique=new HashSet<>();
        for(int iterator = 0;iterator<words.length;iterator++){
            if(!words[iterator].isEmpty()){
                unique.add(words[iterator].toLowerCase());
            }
        }
        String[] uniqueArray=unique.toArray(new String[0]);
        System.out.println("unique words:");
        for(int iterator = 0;iterator < uniqueArray.length;iterator++){
            System.out.println(uniqueArray[iterator]);
        } 
        scanner.close();
    }
}
