package ChapterTwoL;

import java.util.Scanner;

public class ConvertFeetToMetres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double foot = input. nextDouble();

        double meter  = foot * 0.305;
        System.out.printf("%.1f feet is %.4f meters" ,foot, meter);
    }
}
