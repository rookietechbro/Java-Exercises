package ParkingLot;
import java.util.Scanner;
public class MrFemiTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.printf("Welcome %s, it's good to see you!", name);
    }
}