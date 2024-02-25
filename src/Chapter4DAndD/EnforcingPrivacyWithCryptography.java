package Chapter4DAndD;

import java.util.Scanner;

public class EnforcingPrivacyWithCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four digit number: ");
        int number = input.nextInt();
        System.out.println("The number is " + number);

        int firstDigit = number / 1000;
        int secondDigit = (number / 100) % 10;
        int thirdDigit = (number / 10) % 10;
        int fourthDigit = number % 10;
        System.out.printf("The individual digits of the number are %d, %d, %d and %d.\n", firstDigit, secondDigit, thirdDigit, fourthDigit);

        firstDigit = (firstDigit + 7) % 10;
        secondDigit = (secondDigit + 7) % 10;
        thirdDigit = (thirdDigit + 7) % 10;
        fourthDigit = (fourthDigit + 7) % 10;

        int a;
        int b;

        a = firstDigit;
        b = secondDigit;
        firstDigit = thirdDigit;
        secondDigit = fourthDigit;
        thirdDigit = a;
        fourthDigit = b;

        System.out.printf("The encrypted number is %d%d%d%d", firstDigit, secondDigit, thirdDigit, fourthDigit);
    }
}
