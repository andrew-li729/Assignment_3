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
        System.out.println();
        Clothing jeans=new Clothing(21,"Jeans","Levis",35,1,0);
        jeans.Display();
        jeans.displayClothing();
        System.out.println();
        Clothing shirt=new Clothing(22,"Dress Shirt","Izod",25,2,10);
        shirt.Display();
        shirt.displayClothing();
        System.out.println();
        grandTotal=apple.computeTotalPrice()+bread.computeTotalPrice()+jeans.computeTotalPrice()+shirt.computeTotalPrice();
        System.out.println("Grand total: $"+grandTotal);

    }
}
