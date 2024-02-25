package ParkingLot;

import java.util.Scanner;

public class MrFemiTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;
        System.out.print("Enter a whole number: ");
        int number = input.nextInt();
        for (count = 1; count <= 12; count++) {
            int answer = number * count;
            System.out.printf("%d * %d = %d%n",number, count, answer);
        }
    }
}