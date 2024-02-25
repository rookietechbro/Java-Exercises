package ParkingLot;

import java.util.Scanner;
public class MrFemiTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        for(count = 0; count < 10; count++){
            System.out.print("Enter a number: ");
            int answer = input.nextInt();
            if (answer < 0){
                 number1 = number1 + 1;
            }
            if(answer > 0){
                number2 = number2 + 1;
            }
            if (answer == 0){
                number3 = number3 + 1;
            }
        }
        System.out.println("Total number of negative numbers = "+ number1);
        System.out.println("Total number of positive numbers = "+ number2);
        System.out.print("Total number of zeros = "+ number3);
    }
}
