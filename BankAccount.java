import java.util.*;
public class BankAccount {
    static ArrayList<BankAccount> numbers = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public char type;
    public double balance;
    public int accountNumber;

    public BankAccount() {
        //pene
    }

    public BankAccount ( char type, int account) {
        if (type != 'A' && type != 'B' && type != 'C') {
            System.out.println("Invalid type");
            this.type = '³';
            return;
        }
        else{
            this.type = type;
        }
        this.accountNumber = account;
    }

    public void setBalance() {
        double balance2;
        System.out.println("Amount to deposit: ");
        balance2 = scan.nextDouble();
        balance2 = balance + balance2;
        if (this.type == 'A') {
            if (balance2 <= 50000) {
                this.balance = balance2;
                System.out.println("Balance: " + this.balance);
            } else {
                System.out.println("You have exceeded the permitted balance");
            }
        }
        if (this.type == 'B') {
            if (balance2 <= 100000) {
                this.balance = balance2;
                System.out.println("Balance: " + this.balance);
            } else {
                System.out.println("You have exceeded the permitted balance");
            }
        }
        if (this.type == 'C') {
            this.balance = balance2;
            System.out.println("Balance: " + balance);
        }
    }

    public void withdraw() {
        double amount = 0;
        amount = this.balance - amount;
        System.out.println("Amount to withdraw: ");
        amount = scan.nextDouble();
        if (this.type == 'A') {
            if (amount >= 1000) {
                this.balance = amount;
                System.out.println("New balance: " + this.balance);
            } else {
                System.out.println("You are not allowed to withdraw this amount");
            }
        }
        if (this.type == 'B') {
            if (amount >= 5000) {
                this.balance = amount;
                System.out.println("New balance: " + this.balance);
            } else {
                System.out.println("You are not allowed to withdraw this amount");
            }
        }
        if (this.type == 'C') {
            if (amount >= 10000) {
                this.balance = amount;
                System.out.println("New balance: " + this.balance);
            } else {
                System.out.println("You are not allowed to withdraw this amount");
            }
        }
    }
}