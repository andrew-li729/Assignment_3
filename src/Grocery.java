public class Grocery extends Item implements Discount {
    private double price;
    private double units;
    private double discount;

    Grocery(int itemCode, String itemName, double x, double y, double z) {
        super(itemCode, itemName);
        price = x;
        units = y;
        discount = z;
    }


    public double computeDiscount() {
        discount = price*units*(discount / 100);
        return discount;
    }

    double computeTotalPrice(){
        double finalPrice;
        finalPrice=(units*price)-discount;
        return finalPrice;
    }

    public void displayGrocery(){
        System.out.println("Units: "+units+" Price: $"+price+" Discount $"+computeDiscount()+" Item total Price: $"+computeTotalPrice());
    }

}
