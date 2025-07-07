// public class NullPointerException {
//     public static void main(String[] args) {
//        String s=null;
//        System.out.println(s.length());
//        }
//     }

//For the above code it give null pointer exception to handle it we use try catch block and also it is unchecked exception. It is just for the user reference.

public class NullPointerException {
    public static void main(String[] args) {
       String s=null;
       try{
        System.out.println("Length of the string is: "+s.length());
       }
       catch(Exception e){
        System.out.println("Error comes because it is"+e.getMessage());
       }
       finally{
        System.out.println("This block always executes");
       }
       }
    }