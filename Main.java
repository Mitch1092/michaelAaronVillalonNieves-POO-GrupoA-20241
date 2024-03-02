import java.util.*;
public class Main {
    public static void main(String[]args){
        Product prod1 = new Product("hghjg",34.50, 5);
        prod1.setName();
        System.out.println(prod1.getName());
        prod1.setPrice();
        System.out.println(prod1.getPrice());
        prod1.setStock();
        System.out.println(prod1.getStock());
        prod1.addStock(4);
        System.out.println(prod1.getStock());
        prod1.reduceStock(7);
        System.out.println(prod1.getStock());

        Product prod2 = new Product("sgrfdg", 78);
        prod2.setName();
        System.out.println(prod2.getName());
        prod2.setPrice();
        System.out.println(prod2.getPrice());
        prod2.setStock();
        System.out.println(prod2.getStock()) ;
        prod2.addStock(5);
        System.out.println(prod2.getStock());
        prod2.reduceStock(6);
        System.out.println(prod2.getStock());
    }
}