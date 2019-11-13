import java.util.Scanner;

public class Item {
    private int itemCode;
    private String name;
    Scanner input=new Scanner(System.in);
    public Item(int x,String y){
        itemCode=x;
        name=y;
    }

    public void Display(){
        System.out.println("Item code: "+itemCode+" Item name: "+name);
    }
}
