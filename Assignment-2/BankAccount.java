public class BankAccount {
    String accountHolder;
    double balance;
BankAccount(String accountHolder,double balance){
    this.accountHolder=accountHolder;
    this.balance=balance;
}
void deposit(double amount){
    balance=balance+amount;
}
void withdraw(double amount){
    if(balance>=amount){
        balance=balance-amount;
    }
    else{
        System.out.println("Your withdraw amount is more than your balance.");
    }
}
void checkBalance(){
    System.out.println(accountHolder+"Balance:"+balance);
}
public static void main(String[] args) {
    BankAccount account1=new BankAccount("A's:",1000.0);
    BankAccount account2=new BankAccount("B's:",2000.0);
    account1.deposit(2000);
    account1.withdraw(1000);
    account1.checkBalance();
    account2.deposit(500);
    account2.withdraw(2600);
    account2.checkBalance();
}
}