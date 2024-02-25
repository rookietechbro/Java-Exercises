package Chapter4DAndD;

import java.util.Scanner;

/*
4.37 (Distance between two points) Write an application that reads the x and y coordinates of
two points on a plane and prints whether the points are located on a line perpendicular to an axis.
 */
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int countOne = 0; countOne < 1; countOne++) {
            System.out.print("Enter the x coordinate: ");
            double x = input.nextDouble();
            System.out.print("Enter the y coordinate: ");
            double y = input.nextDouble();
            double v = (Math.pow(x, 2)) + (Math.pow(y, 2));
            double z = Math.pow(v, 0.5);
           // System.out.print(z);
            if(z % 1.0 == 0){
                System.out.println("The points are located on a line perpendicular to an axis.");
            } else {
                System.out.println("The points are not located on a line perpendicular to an axis.");
            }
        }
    }
}
