package Chapter2L;

/*
*2.5 (Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total. Here is a sample run:
 */

import java.util.Scanner;

public class FinancialApplicationCalculateTips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        double gratuity = (gratuityRate / 10);
        double total = subtotal + gratuity;

        System.out.print("The gratuity is $" + gratuity + " and total is $" + total);
    }
}