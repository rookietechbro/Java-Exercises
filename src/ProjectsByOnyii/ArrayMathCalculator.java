/**package ProjectsByOnyii;


import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

public class ArrayMathCalculator {
    public int sum (int[] numbers){
        int sum = 0;
        //for (int index = 0; index < numbers.length-1; index++)
        for (int index = ZERO.intValue(); index < numbers.length; index++) {
            sum += numbers[index];
            return sum;
        }
        return 0;

        }

    public int multiply(int[] numbers) {
        int product = 1;
        for (int index = ONE.intValue(); index < numbers.length; index++) {
            product *= numbers[index];
            return product;
        }
        return 0;


    }

    public double average(int[] numbers) {
        int sum = 0;
        for (int index = ONE.intValue(); index < numbers.length; index++) {
            sum += numbers[index];
           double average = (double) sum / numbers.length;
           return average;
        }
        return 0;

    }

    public int[] swap(int[] numbers) {
        ArrayMathCalculator arrayMathCalculator = new ArrayMathCalculator();
        int[] temp = 0;
        for ( int index = 0; index < numbers.length; index++){
            if (index < numbers.length-3){
                temp = numbers[index];
                numbers[index] = numbers[index + 2];
                numbers[index + 2] = temp;
            }
        }
    }
}
*/