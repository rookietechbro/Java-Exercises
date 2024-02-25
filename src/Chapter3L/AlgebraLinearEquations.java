package Chapter3L;

/*
*3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
that “The equation has no solution.”

Sample 1:
Input:  Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
Output: x is -2.0 and y is 3.0
*
Sample :
Input:  Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
Output: The equation has no solution

 */

import java.util.Scanner;

public class AlgebraLinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        System.out.print("Enter d: ");
        double d = input.nextDouble();
        System.out.print("Enter e: ");
        double e = input.nextDouble();
        System.out.print("Enter f: ");
        double f = input.nextDouble();

        double linearEquation = ((a * d) - (b * c));
        double x = ((e * d) - (b * f)) /((a * d) - (b * c));
        double y = ((a * f) - (e * c)) /((a * d) - (b * c));

        if (linearEquation == 0){
            System.out.print("The equation has no solution");
        }
        else {
            System.out.println("x is " + x +" and y is " + y);
        }
    }
}