package ParkingLot;

import java.util.Scanner;

public class MrFemiTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;
        System.out.print("Enter a whole number: ");
        int number = input.nextInt();
        int newTotal = total + number;
        System.out.print("Do you want to enter another number? Answer either 'YES' or 'NO':   ");
        String answer = input.next();

        while (answer.equalsIgnoreCase("yes")) {
            System.out.print("Enter another whole number: ");
            int anotherNumber = input.nextInt();
            newTotal += anotherNumber;
            System.out.print("Do you want to enter another number? Answer either 'YES' or 'NO':   ");
            String anotherAnswer = input.next();
            if (anotherAnswer.equalsIgnoreCase("yes")) {
                count++;
            }
            double average = (double) newTotal / count;
            System.out.printf("The average of the numbers is %f ", average);
        }
    }
}
