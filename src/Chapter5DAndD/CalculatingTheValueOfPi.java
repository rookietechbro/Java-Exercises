package Chapter5DAndD;

import java.util.Scanner;

/*
5.20 (Calculating the Value of π) Calculate the value of π from the infinite series
π = 4 - 4/3 - 4/5 - 4/7 - 4/9 - 4/11 + ...Print a table that shows the value of π approximated by computing the first 200,000 terms of this
series. How many terms do you have to use before you first get a value that begins with 3.14159?
 */
public class CalculatingTheValueOfPi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms in this series: ");
        int terms = input.nextInt();
        double pi;
        int count = 1;
        System.out.print("Terms      " + "Value Of Pi\n");
        do {
            pi = 4 - (4 / (double) count);
            System.out.printf("%d%f%n", count, pi);
            count += 2;
        }
        while (count <= terms);
    }
}