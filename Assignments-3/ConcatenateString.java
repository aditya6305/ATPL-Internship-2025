public class ConcatenateString {
    public static void main(String[] args) 
    {
        String s1="sun";
        String s2="moon";
        String s3="Stars";
        long startTime=System.nanoTime();
        String result=s1+s2+s3;
        long endTime=System.nanoTime();
        System.out.println("Time taken for string:"+result);
        System.out.println("time taken to run:"+(endTime-startTime));
        long startTime1=System.nanoTime();
        StringBuilder sb=new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        sb.append(s3);
        String result1=s1+s2+s3;
        long endTime1=System.nanoTime(); 
        System.out.println("Time taken for string Builder:"+result1);
        System.out.println("time taken to run:"+(endTime1-startTime1));
        long startTime2=System.nanoTime();
        StringBuffer strbuf=new StringBuffer();
        strbuf.append(s1);
        strbuf.append(s2);
        strbuf.append(s3);
        String result2=s1+s2+s3;
        long endTime2=System.nanoTime();
        System.out.println("Time taken for string buffer:"+result2);
        System.out.println("Time taken to run:"+(endTime2-startTime2));
        //Finally String Builder takes less time than String buffer and string.
    }
}
