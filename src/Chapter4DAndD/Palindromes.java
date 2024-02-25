package Chapter4DAndD;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit number and I will tell you if it is a Palindrome: ");
        int number = input.nextInt();

        int digitOne = number / 10000;
        int digitTwo = (number / 1000) % 10;
        int digitThree = (number / 100) % 10;
        int digitFour = (number / 10) % 10;
        int digitFive = number % 10;

        System.out.print(digitOne + "\t");
        System.out.print(digitTwo + "\t");
        System.out.print(digitThree + "\t");
        System.out.print(digitFour + "\t");
        System.out.print(digitFive + "\t");

        if (digitOne == digitFive && digitTwo == digitFour) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }
    }
}