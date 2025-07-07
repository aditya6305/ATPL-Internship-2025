public class CompareCases {
    public static void main(String[] args) {
        String s1="Java";
        String s2="java";
        System.out.println("Comparing strings using equlas():"+s1.equals(s2));
        System.out.println("Comparing strings using equalsIgnoreCase():"+s1.equalsIgnoreCase(s2));
        System.out.println("Comparing to strings with the help of compareTo() method:"+s1.compareTo(s2));//It checks the strings exactly.If not it returns a dummy integer value.
    }
}
