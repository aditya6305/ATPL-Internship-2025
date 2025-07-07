class Payment{
    void processPayment(){
        System.out.println("Processing payment..");
    }
}
class CreditCard extends Payment{
    void processPayment(){
        System.out.println("processing credit card payments..");
    }
}
class UpiPayment extends Payment{
    void processPayment(){
        System.out.println("Processing upi payments..");
    }
}
public class PaymentClass{
public static void main(String[] args){
    Payment payment=new CreditCard();
    Payment payment1=new UpiPayment();
    payment.processPayment();
    payment1.processPayment();
}
}