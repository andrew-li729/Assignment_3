import java.util.Scanner;

public class demo {
    public static void main(String[]args){
        double grandTotal;

        Grocery bread=new Grocery(11,"Bread",1.50,2,0);
        bread.Display();
        bread.displayGrocery();
        System.out.println();
        Grocery apple=new Grocery(12,"Apple",0.75,6,1);
        apple.Display();
        apple.displayGrocery();

        grandTotal=apple.computeTotalPrice()+bread.computeTotalPrice();
        System.out.println("Grand total: $"+grandTotal);

    }
}
