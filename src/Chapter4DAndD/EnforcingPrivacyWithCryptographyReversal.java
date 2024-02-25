package Chapter4DAndD;

import java.util.Scanner;

public class EnforcingPrivacyWithCryptographyReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the encrypted number: ");
        int encryptedNumber = input.nextInt();
        System.out.println("The encrypted number is " + encryptedNumber);

        int firstDigit = encryptedNumber / 1000;
        int secondDigit = (encryptedNumber / 100) % 10;
        int thirdDigit = (encryptedNumber / 10) % 10;
        int fourthDigit = encryptedNumber % 10;
        System.out.printf("The individual digits of the encrypted number are %d, %d, %d and %d.\n", firstDigit, secondDigit, thirdDigit, fourthDigit);

        int a;
        int b;

        a = firstDigit;
        b = secondDigit;
        firstDigit = thirdDigit;
        secondDigit = fourthDigit;
        thirdDigit = a;
        fourthDigit = b;

        if (firstDigit == 7 || firstDigit == 8 || firstDigit == 9){
            firstDigit = ((firstDigit + 10) - 7) % 10;
        }
        else{
            firstDigit = (firstDigit + 10) - 7;
        }
        if (secondDigit == 7 || secondDigit == 8 || secondDigit == 9){
            secondDigit = ((secondDigit + 10) - 7) % 10;
        }
        else{
            secondDigit = (secondDigit + 10) - 7;
        }
        if (thirdDigit == 7 || thirdDigit == 8 || thirdDigit == 9){
            thirdDigit = ((thirdDigit % 10) - 7) % 10;
        }
        else{
            thirdDigit = (thirdDigit + 10) - 7;
        }
        if (fourthDigit == 7 || fourthDigit == 8 || fourthDigit == 9){
            fourthDigit = ((fourthDigit % 10) - 7) % 10;
        }
        else{
            fourthDigit = (fourthDigit + 10) - 7;
        }

        System.out.print("After decrypting, the original number is " +firstDigit+secondDigit+thirdDigit+fourthDigit + ".");

    }
}
