package Chapter4DAndD;

import java.util.Scanner;

public class TaxCollector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int count = 1; count <= 3; count++) {
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            System.out.println("Name: " + name);
            System.out.println("Salary: " + "$" + salary);

            if (salary > 0.0 && salary <= 30_000) {
               double tax = 0.15 * salary;
                System.out.println("Your total tax is " + "$" + tax + "\n");
            } else if (salary >= 30_000) {
                double tax = (0.15 * 30_000) + ((salary - 30_000) * 0.20);
                System.out.println("Your total tax is " + "$" + tax + "\n");
            }
        }
    }
}