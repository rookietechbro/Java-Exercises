package ChallengesFromOtherSources.SetAndGet;

class CarApplication {
    private String model;
    private String year;
    private double price;


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }


    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}