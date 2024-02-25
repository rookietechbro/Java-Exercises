package Chapter5DAndD;

import java.util.Scanner;

/*
5.11 (Extremes) Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input.
 */
public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of values you will be inputting: ");
        int numberOfValues = input.nextInt();
        int maximum = 0;
        int minimum = 0;
        int value1 = 0;

        System.out.print("Enter a value: ");
        int value = input.nextInt();

        for (int count = 0; count < numberOfValues; count++) {
            System.out.print("Enter a value: ");
            value1 = input.nextInt();
            if (value1 < minimum) {
            minimum = input.nextInt();
            System.out.print("Minimum number is ");
        } else if (value1 > maximum) {
            maximum = input.nextInt();
            System.out.println("Maximum number is ");
        }
        }
    }
}