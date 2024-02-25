package ProjectsByOnyii1;

import java.util.Scanner;
public class HighestAndLowestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter a second number: ");
        int secondNumber = input.nextInt();
       // System.out.print("Enter a third number: ");
       // int thirdNumber = input.nextInt();

        int max1 = Math.max(firstNumber, secondNumber);//finding the highest numbers using a Math function.
        System.out.println(max1);

        int max2 = (firstNumber > secondNumber) ? firstNumber : secondNumber; // finding the highest numbers using a conditional expression.
        System.out.println(max2);
       /* switch (highestNumber) {

            case 0:
                if (firstNumber > secondNumber && firstNumber > thirdNumber) {
                    System.out.println(firstNumber + " is the highest");
                }
            case 1:
                if (secondNumber > thirdNumber && secondNumber > firstNumber) {
                    System.out.println(secondNumber + " is the highest");
                }
            case 2:
                if (thirdNumber > firstNumber && thirdNumber > secondNumber) ;
                System.out.println(thirdNumber + " is the highest");
        }

        */
        System.out.println("Enter a number: ");
        double x = input.nextDouble();
        System.out.println("Enter a number: ");
        double y = input.nextDouble();
        System.out.println("Enter a number: ");
        double z = input.nextDouble();
        System.out.println((x < y && y < z) ? "sorted" : "not sorted");
    }
}

