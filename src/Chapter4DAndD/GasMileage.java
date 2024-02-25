package Chapter4DAndD;

import java.util.Scanner;

/*
4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
from the user.


Algorithm:
------Get the miles per gallon obtained for all the trips.

1. Declare milesDriven;
2. Declare gallonsUsed;
3. Declare totalMilesPerGallon;;
5. Do ask user to input milesDriven, gallons used and calculate the miles per gallon for each trip
6. Add miles per gallon for this trip to the total miles per gallon
7. Print the combined miles per gallon obtained for all trips up to this point
8. while making sure that both miles driven and gallons used are not zero.
 */
public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int milesDriven;
        int gallonsUsed;
        double totalMilesPerGallon = 0;
        do { System.out.print("Enter the miles driven: ");
             milesDriven = input.nextInt();
             System.out.print("Enter the gallons used: ");
             gallonsUsed = input.nextInt();
             double milesPerGallonForThisTrip = (double) milesDriven / gallonsUsed;
             System.out.println("Miles per gallon for this trip: " + milesPerGallonForThisTrip);
             totalMilesPerGallon += milesPerGallonForThisTrip;
            System.out.println("Total miles per gallon up to this point is: " + totalMilesPerGallon);
        }
        while(milesDriven != 0 && gallonsUsed != 0);
    }
}
