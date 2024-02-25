package ChapterTwoL;

import java.util.Scanner;

/*

2.2 (Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length

 */
public class ComputeVolumeOfACylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of a cylinder: ");
        int length = input.nextInt();

        final double PI =3.14159 ;
        double area = radius * radius * PI;
        double volume = area * length;
        System.out.printf("The area is %.4f%n", area);
        System.out.printf("The volume is %.1f", volume);

    }
}
