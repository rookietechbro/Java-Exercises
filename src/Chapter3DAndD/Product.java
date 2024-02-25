package ProjectsByOnyii;

public class Product {

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }
    public static int multiply(int number1, int number2, int number3) {
        return number1 * number2 * number3;
    }

    public static int multiply(int... numbers) {
        int total = 1;

//        for(int number = 0; number < numbers.length; number++){
//            total *= numbers[number];

        for(int whatever : numbers) {
            total *= whatever;
        }
        return total;
    }
}
