import java.util.*;
public class Bank {
    public static int xd = 0;
    public String lol = "";
    static ArrayList<Employee> employees = new ArrayList <Employee>();
    static Scanner scan = new Scanner(System.in);

    public static void Menu(){
        int xd, kk;

        do {
            System.out.println("Menu");
            System.out.println("1 Add employee");
            System.out.println("2 Add account");
            System.out.println("3 Deposit");
            System.out.println("4 Withdraw");
            System.out.println("5 Employee status");
            System.out.println("6 Check all accounts");
            System.out.println("0 Exit");

            xd = scan.nextInt();
            scan.nextLine();

            switch (xd){
                case 1 -> addEmployee();
                case 2 -> {
                    showEmployees();
                    System.out.print("Select employee: ");
                    kk = scan.nextInt() - 1;
                    scan.nextLine();

                    Employee test = employees.get(kk);
                    test.addAccount();
                }
                case 3 -> {
                    showEmployees();
                    System.out.print("Select employee: ");
                    kk = scan.nextInt() - 1;
                    scan.nextLine();

                    Employee test = employees.get(kk);
                    test.setBalance();

                }
                case 4 -> {
                    showEmployees();
                    System.out.print("Select employee: ");
                    kk = scan.nextInt() - 1;
                    scan.nextLine();

                    Employee test = employees.get(kk);
                    test.withdraw();
                }
                case 5 -> {
                    showEmployees();
                    System.out.print("Select employee: ");
                    kk = scan.nextInt() - 1;
                    scan.nextLine();

                    Employee test = employees.get(kk);
                    test.getInfo();

                }
                case 6 -> {
                    checkAll();
                }
                case 0 -> System.out.println("A mimir");
            }
        } while (xd != 0);
    }

    private static void showEmployees() {
        int i = 1;
        System.out.printf("| %-3s | %-10s |%n", "No.", "Name");
        for (Employee menso : employees) {
            System.out.printf("| %-3s | %-10s |%n",i, menso.getName());
            i ++;
        }
    }

    public static void checkAll() {
        int i = 1;
        System.out.printf("| %-3s | %-10s |%n", "No.", "Name");
        for (Employee menso : employees) {
            System.out.printf("| %-3s | %-10s |%n",i, menso.getName());
            i ++;
            System.out.println("Accounts: ");
            menso.getInfo();
        }
    }

    public static void addEmployee(){
        String aux;
        Employee testEmployee = new Employee();

        System.out.println("What is your name?");
        aux = scan.nextLine();

        testEmployee.setName(aux);

        employees.add(testEmployee);

    }
}