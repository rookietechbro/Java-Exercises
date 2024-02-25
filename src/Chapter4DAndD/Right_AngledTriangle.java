package Chapter4DAndD;

import java.util.Scanner;

public class Right_AngledTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10 to represent the length of the base of the triangle: ");

        int baseOfTriangle = input.nextInt();
        int count = 0;
        String sign = "#";

        if (baseOfTriangle > 10) {
            System.out.println("""
                    Please stick to the rule!
                    Only numbers between 1 and 10 are allowed.
                    Kindly restart this process.""");
        } else {
            do {
                System.out.println(sign);
                count++;
                sign = sign + "#";
            } while (count < baseOfTriangle);
        }
    }
}