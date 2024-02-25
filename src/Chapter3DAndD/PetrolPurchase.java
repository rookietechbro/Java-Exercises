package Chapter3DAndD;

public class Petrol {
    private String location;
    private String petrolType;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public Petrol(String location, String petrol, int quantity, double purchaseInLitres, double percentageDiscount) {
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
