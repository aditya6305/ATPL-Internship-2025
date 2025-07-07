public class CompareStrings {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        String s3=new String("Java");
        System.out.println("By using == for string1 and string2:"+(s1==s2));//It is true because it goes to the same location while we are comparing using == in the string pool
        System.out.println("By using == for string1 and string3:"+(s1==s3));
        System.out.println("By using equals() for string1 and string2:"+(s1.equals(s2)));
        System.out.println("By using equals() for string1 and string2:"+(s1.equals(s3)));
    }
}
