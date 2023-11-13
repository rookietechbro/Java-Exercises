package ChallengesFromOtherSources.SetAndGet;

import ChallengesFromOtherSources.SetAndGet.CarApplication;

public class  Car {
    public static void main(String[] args){

        CarApplication volvo = new CarApplication();
        CarApplication nissan = new CarApplication();

        volvo.setModel("Volvo");
        volvo.setYear("2022");
        volvo.setPrice(2000);
        double discountedPriceForVolvo = volvo.getPrice() * 0.05;
        double newPriceForVolvo = volvo.getPrice() - discountedPriceForVolvo;

        nissan.setModel("Nissan");
        nissan.setYear("2023");
        nissan.setPrice(5000);
        double discountedPriceForNissan = nissan.getPrice() * 0.07;
        double newPriceForNissan = nissan.getPrice() - discountedPriceForNissan;

        System.out.println(volvo.getModel());
        System.out.println(volvo.getYear());
        System.out.println(volvo.getPrice());
        System.out.println(newPriceForVolvo);

        System.out.println(nissan.getModel());
        System.out.println(nissan.getYear());
        System.out.println(nissan.getPrice());
        System.out.println(newPriceForNissan);

    }
}
