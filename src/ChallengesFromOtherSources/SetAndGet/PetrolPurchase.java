package ChallengesFromOtherSources.SetAndGet;

public class PetrolPurchase {
    private final String location;
    private final String petrolType;
    private final int purchase;
    private final double pricePerLiter;
    private final double percentageDiscount;
    private double netPurchaseAmount;

    public PetrolPurchase(String location, String petrolType, int purchase, double pricePerLiter, double percentageDiscount){
        this.location = location;
        this.petrolType = petrolType;
        this.purchase = purchase;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public String getLocation() {
        return location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public int getPurchase() {
         return  purchase;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }
    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setNetPurchaseAmount(double quantity){
        this.netPurchaseAmount = (quantity * pricePerLiter) - percentageDiscount;
    }
    public double getNetPurchaseAmount(){
        return netPurchaseAmount;
    }

}


