package ChapterTwoL;
/*
2.23 (Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip.
 */

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();
        System.out.print("Enter the miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter the price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double numberOfGallonsPerUnitDistance = drivingDistance/milesPerGallon;
        double costOfTrip = pricePerGallon * numberOfGallonsPerUnitDistance;

        System.out.printf("The cost of driving is $%.2f", costOfTrip);
    }
}
