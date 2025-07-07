public class StringsAnalyze {
    public static void main(String[] args) {
        String s="Learning Java is fun and interesting";
        String[] count=s.split(" ");
        System.out.println("length of the text is:"+count.length);
        System.out.println("First occurence of i is:"+s.indexOf('i'));
        System.out.println("Last index of i is:"+s.lastIndexOf('i'));
        System.out.println("Starts with Learn? "+s.startsWith("Learn"));
        System.out.println("Starts with ing? "+s.endsWith("ing"));
    }
}
