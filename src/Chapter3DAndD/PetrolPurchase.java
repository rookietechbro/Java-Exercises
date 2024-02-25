package Chapter3DAndD;
/*
3.12 (Class PetrolPurchase) Create a class called PetrolPurchase to represent information about the petrol you purchase.
The class should include five pieces of information in the form of instance variables—the station’s location
(type String), the type of petrol (type String), the quantity (type int) of the purchase in liters, the price per liter
(double), and the percentage discount(double). Your class should have a constructor that initializes the five instance
variables. Provide a set and a get method for each instance variable. In addition, provide a method named
getPurchaseAmount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value. Write an application class named
PetrolPurchase that demonstrates the capabilities of class PetrolPurchase.
*/
public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String location, String petrol, int quantity, double purchaseInLitres, double percentageDiscount) {
        this.location = location;
        this.petrolType = petrol;
        this.quantity = quantity;
        this.pricePerLitre = purchaseInLitres;
        this.percentageDiscount = percentageDiscount;

    }

    public String getLocation() {
        return location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPurchaseInLitres() {
        return pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getPurchaseAmount() {
        double netPurchaseAmount = quantity * pricePerLitre;
        double discount = (netPurchaseAmount * percentageDiscount) / 100;
        return netPurchaseAmount - discount;
    }
}
