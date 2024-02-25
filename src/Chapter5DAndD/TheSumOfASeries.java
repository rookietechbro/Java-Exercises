package Chapter5DAndD;

import java.util.Scanner;

/*
5.13 (The Sum of a Series) Find the summation of the sequence of numbers 1, 2, 3 … n, where
n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the
corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
with the variable that accumulates the product?
 */
public class TheSumOfASeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value you want a summation for: ");
        int n = input.nextInt();
        long total = 0;
        int count = 1;
        System.out.printf("%s%s%n","n      ", "Corresponding Sum");
        do {
            total += count;
            if(count < 10) {
                System.out.printf("%d%8d%n", count, total);
            }
            else {
                System.out.printf("%d%7d%n", count, total);
            }
            count++;
        } while (count <= n);

    }
}
/*
If this were a product instead of a sum, what difficulty might you encounter with the variable that accumulates the product?
Answer:
At initialization point where total = 0, all the summation will always be 0. To avoid this, total has to be 1 so as to avoid that logic error.
 */
