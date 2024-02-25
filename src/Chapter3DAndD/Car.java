package ProjectsByOnyii;

public class Car {
    String model;
    String year;
    double price;
    double percentageDiscount;

    public Car(String model, String year, double price, double percentageDiscount){
        this.model = model;
        this.year = year;
        if (price > 0){
            this.price = price;
        }
        this.percentageDiscount = percentageDiscount;
    }

    public String getModel(){
        return model;
    }
    public String getYear(){
        return year;
    }
    public double getPrice(){
        double discount = (price * percentageDiscount) / 100;
        return price - discount;
    }
}
