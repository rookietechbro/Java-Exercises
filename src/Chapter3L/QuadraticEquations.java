package ChapterThreeL;

import java.util.Scanner;

/*
3.1 (Algebra: solve quadratic equations) The two roots of a quadratic equation
ax2 + bx + c = 0 can be obtained using the following formula:
                        -b + sqrt(b^2 - 4ac)
                  r1 =  ____________________
                                2a


                         -b - sqrt(b^2 - 4ac)
                  r2 =   ____________________
                                2a

b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.
Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some
sample runs.

Enter a, b, c: 1.0 3 1
The equation has two roots -0.381966 and -2.61803

Enter a, b, c: 1 2.0 1
The equation has one root -1

Enter a, b, c: 1 2 3
The equation has no real roots

 */
public class QuadraticEquations {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a: ");
    double a = input.nextDouble();
    System.out.print("Enter b: ");
    double b = input.nextDouble();
    System.out.print("Enter c: ");
    double c = input.nextDouble();

    double discriminant = (b * b) - (4 * a * c);
    
    double r1 =(-b + (Math.pow(discriminant, 0.5))) / 2;
    double r2 =(-b - (Math.pow(discriminant, 0.5))) / 2;

    if (discriminant > 0){
        System.out.printf("The equation has two roots %f and %f" , r1 ,r2);
    }
    if (discriminant == 0){
        System.out.printf("The equation has one root %.0f " , r1);
    }
    if (discriminant < 0){
        System.out.print("The equation has no real roots");
    }
    }
}