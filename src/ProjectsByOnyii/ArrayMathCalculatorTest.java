package ProjectsByOnyii;

/** import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMathCalculatorTest {

    @Test
    public void testCalculateSum(){
        //given
        ArrayMathCalculator arrayMathCalculator = new ArrayMathCalculator();
        int[] numbers = {1,2,3,4,5,10};
        //when
        int sum = arrayMathCalculator.sum(numbers);
        System.out.println(sum);
        //check
        assertEquals(25, sum);


    @Test
        public void testCalculateProduct() {
            ArrayMathCalculator arrayMathCalculator = new ArrayMathCalculator();
            int[] numbers = {2, 4, 6};
            int product = arrayMathCalculator.multiply(numbers);
            assertEquals(48, product);
        }


    @Test
        public void testCalculateAverage() {
            ArrayMathCalculator arrayMathCalculator = new ArrayMathCalculator();
            int[] numbers = {2, 4, 6};
            double average = arrayMathCalculator.average(numbers);
            assertEquals(4, average);
        }

    @Test
        public void testSwapElement(){
        ArrayMathCalculator arrayMathCalculator = new ArrayMathCalculator();
        int[] numbers = {1, 2, 3, 4, 5};


         * replace first with the third element
         * replace the second with first
         * replace the third wth the fourth
         * replace fourth with the second


          int[] result = arrayMathCalculator.swap(numbers);
          int[] expected = {3, 1, 4, 2, 5};
          assertArrayEquals(expected, result);
    }



}
}
*/