public class StringDemonstrate{
    public static void main(String[] args) {
        String s1="Hello";
        String s2=s1;
        s1=s1.concat(" World");
        System.out.println("String1 is:"+s1);
        System.out.println("String2 is:"+s2);
    }
}