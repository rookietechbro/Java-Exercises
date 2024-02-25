package Chapter5DAndD;
/*
5.12 (Integers Divisible by 3) Write an application that calculates the sum of those integers between
1 and 30 that are divisible by 3.
 */
public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        int sum = 0;
        int count;
        for (count = 1; count <= 30; count++){
          if (count % 3 == 0){
              sum += count;
          }
        }
        System.out.println("The sum of those integers between 1 and 30 that are divisible by 3 is " + sum + ".");
    }
}
