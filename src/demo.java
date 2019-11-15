import java.util.Scanner;

public class demo {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int itemCode;

        String itemName;
        System.out.println("Enter Item code:");
        itemCode=input.nextInt();
        input.nextLine();
        System.out.println("enter item name;");
        itemName=input.nextLine();
        Item i2=new Item(itemCode,itemName);
        i2.Display();
        Grocery g1=new Grocery(itemCode,itemName,20,1,10);
        g1.displayGrocery();
    }
}
