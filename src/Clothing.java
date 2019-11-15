public class Clothing extends Item implements Discount,Tax {
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp=8.5;
    Clothing(int itemCode, String itemName,String b, double x, double y, double z) {
        super(itemCode, itemName);
        brand = b;
        price = x;
        units = y;
        discount = z;
    }


    public double computeDiscount() {
        discount = price*units*(discount / 100);
        return discount;
    }

    public double computeTax(){
        double tax;
        tax=(price*units-discount)*(taxp/100);
        return tax;
    }

    double computeTotalPrice(){
        double finalPrice;
        finalPrice=(units*price)-discount+computeTax();
        return finalPrice;
    }

    public void displayClothing(){
        System.out.println("Units: "+units+" Price: $"+price+" Brand: "+brand+" Discount $"+computeDiscount()+" Item total Price: $"+computeTotalPrice());
    }

}