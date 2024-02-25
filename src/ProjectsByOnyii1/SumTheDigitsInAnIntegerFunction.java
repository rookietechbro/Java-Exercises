package ProjectsByOnyii;

public class SumTheDigitsInAnIntegerFunction {
    public static void main(String[] args) {
    }

     public static long sumDigit(Long number) {
          long firstDigit = number / 100;
          long secondDigit = (number % 100)/10;
          long thirdDigit = number % 10;
           return (firstDigit + secondDigit + thirdDigit);

     }

    }

