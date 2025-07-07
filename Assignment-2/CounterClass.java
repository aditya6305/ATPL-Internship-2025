class Counter{
    static int count=0;
    Counter(){
        count++;
    }    
    static void instances(){
        System.out.println("Total instances it is updated is: "+count);
    }
}
public class CounterClass{
    public static void main(String[] args) {
        
    Counter counter1=new Counter();
    Counter counter2=new Counter();
    Counter counter3=new Counter();
    Counter.instances();
}
}