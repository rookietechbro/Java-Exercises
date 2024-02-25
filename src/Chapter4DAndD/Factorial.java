package Chapter4DAndD;

import java.util.Scanner;

/*
4.38 (Factorial) The factorial of a non-negative integer n is written as n! (pronounced “n factorial”)
and is defined for values of n greater than or equal to 1 as:
n! = n · (n – 1) · (n – 2) · … · 1
and for the n value 0 as:
n! = 1
For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
a) Write an application that reads a non-negative integer and computes and prints its factorial.
b) Write an application that estimates the value of the mathematical constant e by using
the following formula. Allow the user to enter the number of terms to calculate.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the value of x: ");
        int x = input.nextInt();

        int count;
        int factorial = 1;
        double e = 0;
        double eRaisedToThePowerOfX = 0;

        for (count = 0; count < number; count++) {
            factorial = factorial * (number - count);
            e = 1 + (double) (1 / (factorial));
            eRaisedToThePowerOfX = 1 + ((Math.pow(x , count) / (factorial)));
        }
        System.out.println("The factorial of " + number + " is " + factorial + ".");
        System.out.println("The e of " + number + " is " + e + ".");
        System.out.printf("The eRaisedToThePowerOfX is %.2f.", eRaisedToThePowerOfX);
    }
}