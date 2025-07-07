public class Flight {
    String FlightNumber;
    String destination;
    double duration;
    Flight(){
        FlightNumber="A123";
        destination="Vizag";
        duration=5.0;
    }
    Flight(String FlightNumber,String destination,double duration){
        this.FlightNumber=FlightNumber;
        this.destination=destination;
        this.duration=duration;
    }
    void show(){
        System.out.println("FlighNumber:"+FlightNumber+ " Destination:"+destination+" duration:"+duration);
    }
    public static void main(String[] args) {
        Flight flight1=new Flight();
        Flight flight2=new Flight("B123","Hyderabad",4.5);
        flight1.show();
        flight2.show();
    }
}
