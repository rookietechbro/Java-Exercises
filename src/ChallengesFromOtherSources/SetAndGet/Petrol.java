package ChallengesFromOtherSources.SetAndGet;

import ChallengesFromOtherSources.SetAndGet.PetrolPurchase;

import java.util.Scanner;

public class Petrol{
    public static void main(String[] args){
        Scanner userInputForScanner = new Scanner(System.in);
        PetrolPurchase input = new PetrolPurchase("Festac", "AGO", 5000,600.02,1.1);

       System.out.println(input.getLocation());
       System.out.println(input.getPetrolType());
       System.out.println(input.getPurchase());
       System.out.println(input.getPricePerLiter());
       System.out.println(input.getPercentageDiscount());

       System.out.println("Quantity To Be Purchased: ");
       double quantity = userInputForScanner.nextDouble();
       input.setNetPurchaseAmount(quantity);
       System.out.println("The amount is " + input.getNetPurchaseAmount());
    }
}
