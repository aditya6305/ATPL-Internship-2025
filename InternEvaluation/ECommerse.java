interface InnerPaymentClass {
    void pay(){
        System.out.println("Processing payment..");
    }
    
}
class CreditCard implements InnerPaymentClass{
    public  void pay(){
        System.out.println("processing credit card payments..");
    }
}
class UpiPayment implements InnerPaymentClass{
    public  void pay(){
        System.out.println("Processing upi payments..");
    }
}
class CashOnDelivery implements InnerPaymentClass{
    public void pay(){
        System.out.println("process cashondelivery payments..");
    }
}
public class ECommerse{
public static void main(String[] args){
    InnerPaymentClass payment=new CreditCard();
    InnerPaymentClass payment1=new UpiPayment();
    InnerPaymentClass payment2=new CashOnDelivery();
    payment.pay();
    payment1.pay();
    payment2.pay();
}
}