import java.util.*;
public class Product {
    public String name = "  " ;
    public double price = 0;
    public int stock = 0;
    Scanner scan = new Scanner(System.in);

    public Product (String name, double price,int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        System.out.println("Enter name: ");
        name = scan.nextLine();
    }
    public double getPrice(){

        return price;
    }
    public void setPrice(){
        System.out.println("Enter price: ");
        price = scan.nextDouble();
    }
    public int getStock(){

        return stock;
    }
    public void setStock(){
        System.out.println("Enter stock: ");
        stock = scan.nextInt();
    }
    public void addStock(int amount){
        System.out.println("Add: ");
        amount = scan.nextInt();
        if (amount>0){
            stock=stock+amount;
        }
    }
    public void reduceStock(int amount){
        System.out.println("Reduce: ");
        amount = scan.nextInt();
        if (amount>0 && amount <= stock){
            stock=stock-amount;
        }
}