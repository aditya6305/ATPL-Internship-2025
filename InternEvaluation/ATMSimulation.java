import java.util.Scanner;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class NegativeDeposit extends Exception{
    public NegativeDeposit(String message){
        super(message);
    }
}
class BankATM {
    private double balance;
    public void deposit(double amount) throws NegativeDeposit {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount" + amount);
        } else {
            throw new NegativeDeposit("Enter valid deposit amount");
        }
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Enter more than 0");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance.Your Account has:" + balance);
        } else {
            balance-=amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}
public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankATM atm = new BankATM();
        boolean running = true;
        while (running) {
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount:");
                    double dep = scanner.nextDouble();
                    try{
                        atm.deposit(dep);
                    }
                    catch(NegativeDeposit e){
                        System.out.println("Error:"+e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount:");
                    double wd = scanner.nextDouble();
                    try {
                        atm.withdraw(wd);
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}