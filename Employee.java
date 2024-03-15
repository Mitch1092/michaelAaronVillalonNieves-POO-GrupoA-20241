import java.util.*;
public class Employee {
    static Scanner scan = new Scanner(System.in);
    public ArrayList <BankAccount> accounts = new ArrayList<>();
    private String name;
    public BankAccount account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(){
        int aux;
        String lmao;
        char lolxd;
        BankAccount TestAccount = new BankAccount();
        BankAccount.numbers.add(TestAccount);

        System.out.println("What type of account do you need?");
        lmao = scan.nextLine();
        lmao = lmao.toUpperCase();
        lolxd = lmao.charAt(0);

        while (lolxd != 'A' && lolxd != 'B' && lolxd != 'C') {
            System.out.println("Please enter a valid type of account");
            lmao = scan.nextLine();
            lmao = lmao.toUpperCase();
            lolxd = lmao.charAt(0);
        }

        TestAccount.type = lolxd;
        boolean isUnique = true;

        System.out.println("What will be your account"); //jiji
        aux = scan.nextInt(); //532574\n
        scan.nextLine(); //\n

        if (!BankAccount.numbers.isEmpty()) {
            do {
                for (BankAccount acab : BankAccount.numbers) {
                    if (aux == acab.accountNumber) {
                        isUnique = false;
                        System.out.println("Number in use. Enter another.");
                        aux = scan.nextInt();
                        scan.nextLine();
                        break;
                    } else {
                        isUnique = true;
                    }
                }
            } while (!isUnique);
        }

        TestAccount.accountNumber = aux;

        accounts.add(TestAccount);
    }
    public void getInfo () {
        int i = 1;
        System.out.printf("| %-3s | %-4s | %-6s | %-8s |%n", "In.","Type", "Number", "Balance");

        for (BankAccount sex : accounts) {
            System.out.printf("| %-3s | %-4s | %-6s | %-8s |%n", i, sex.type, sex.accountNumber, sex.balance);
            i ++;
        }
    }
    public void setBalance() {
        int kk;

        int i = 1;
        System.out.printf("| %-3s | %-4s | %-6s | %-8s |%n", "In.","Type", "Number", "Balance");

        for (BankAccount sex : accounts) {
            System.out.printf("| %-3s | %-4s | %-6s | %-8s |%n", i, sex.type, sex.accountNumber, sex.balance);
            i ++;
        }

        System.out.println("Select account: ");
        kk = scan.nextInt() - 1;
        BankAccount jfk = accounts.get(kk);

        jfk.setBalance();
    }
    public void withdraw(){
        int kk;

        int i = 1;
        System.out.printf("| %-3s | %-4s | %-6s | %-8s |%n", "In.","Type", "Number", "Balance");

        for (BankAccount sex : accounts) {
            System.out.printf("| %-3s | %-4s | %-6s | %-8s |%n", i, sex.type, sex.accountNumber, sex.balance);
            i ++;
        }

        System.out.println("Select account: ");
        kk = scan.nextInt() - 1;
        BankAccount jfk = accounts.get(kk);

        jfk.withdraw();
    }
}