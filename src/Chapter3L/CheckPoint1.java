package Chapter3L;

/*
Write an if statement that increases pay by 3% if score is greater than 90.
 */

import java.util.Scanner;

public class CheckPoint1 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a score: ");
                double score = input.nextDouble();
                System.out.print("How much is the pay?: ");
                double pay = input.nextDouble();

                if (score > 90) {
                    pay = pay + (pay * 0.3);
                }
                else
                    pay = pay + (pay * 0.1);
                System.out.println("Pay is "+ pay);
            }
        }
