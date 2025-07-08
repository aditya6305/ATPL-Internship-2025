import java.util.Scanner;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankATM {
    private double balance;
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount" + amount);
        } else {
            System.out.println("Erro:Enter valid deposit amount.");
        }
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Enter more than 0");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance" + balance);
        } else {
            balance-=amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class ATMTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankATM atm = new BankATM();
        boolean running = true;
        System.out.println("Welcome to MyAtm");
        while (running) {
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Enter choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount:");
                    double dep = sc.nextDouble();
                    atm.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount:");
                    double wd = sc.nextDouble();
                    try {
                        atm.withdraw(wd);
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current Balance:" + atm.getBalance());
                    break;
                case 4:
                    running = false;
                    System.out.println("Thanyou for using MyAtm");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}