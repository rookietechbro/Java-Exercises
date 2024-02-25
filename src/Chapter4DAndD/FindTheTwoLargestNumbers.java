package Chapter4DAndD;

import java.util.Scanner;

public class FindTheTwoLargestNumbers {
    public static void main(String[] args) {

        int largestNumber1 = 0;
        int largestNumber2 = 0;

        for (int count = 0; count < 5; count++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int numberOne = input.nextInt();
            System.out.print("Enter a number: ");
            int anotherNumber = input.nextInt();

            if (anotherNumber > numberOne && anotherNumber > largestNumber2) {
                largestNumber2 = anotherNumber;
            }
            if (numberOne > anotherNumber) {
                largestNumber1 = numberOne;
            }
        }
        System.out.println("The first largest number is " + largestNumber1);
        System.out.println("The second largest number is " + largestNumber2);
    }
}
