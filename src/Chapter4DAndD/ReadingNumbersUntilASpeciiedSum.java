package Chapter4DAndD;

import java.util.Scanner;

public class ReadingNumbersUntilASpeciiedSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberOne = input.nextInt();
        int total = 0;

        do {
            System.out.print("Enter another number: ");
            int anotherNumber = input.nextInt();
            total += anotherNumber;
            System.out.println("Total number now is: " + total);
        } while (total < numberOne);
    }
}
