package Chapter2L;

import java.util.Scanner;

/*

*2.19 (Geometry: area of a triangle) Write a program that prompts the user to enter
        three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
        The formula for computing the area of a triangle is
        s = (side1 + side2 + side3)/2;
        area = 2s(s - side1)(s - side2)(s - side3)
        Here is a sample run:
        Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
        The area of the triangle is 33.6.


        ***** Note that the distance between two points (x1, y1) and (x2, y2)
        can be computed using the formula sqrt((x2 - x1)2 + (y2 - y1)2).
 */

public class AreaOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter a point y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter a point x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter a point y2: ");
        double y2 = input.nextDouble();
        System.out.print("Enter a point x3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter a point y3: ");
        double y3 = input.nextDouble();

        double side1 =  - x1;
        System.out.println(side1);
        double side2 = y2 - x2;
        System.out.println(side2);
        double side3 = y3 - x3;
        System.out.println(side3);

        double s = (side1 + side2 + side3) / 2;

        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)),
                0.5);
        System.out.println("The area of the triangle is " + area);
    }
}
