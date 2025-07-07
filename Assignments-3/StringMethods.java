public class StringMethods {
    public static void main(String[] args) {
        String s=" Java Programming ";
        System.out.println("By perform trimming:"+s.trim());
        System.out.println("After converting them into lowercase:"+s.toLowerCase());
        System.out.println("After converting them into uppercase:"+s.toUpperCase());
        System.out.println("After replacing space with :"+s.replace(" ","-"));
        System.out.println("Substring in java is:"+s.substring(5,12));
        System.out.println("Index of a is:"+s.indexOf('a'));
    }
}
