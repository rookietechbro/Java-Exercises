package Chapter3DAndD;

public class AddUp {

    public static int sum(int number, int secondNumber) {
        return number + secondNumber;
    }
    public static int sum(int firstNumber, int secondNumber, int thirdNumber){
        return firstNumber + secondNumber + thirdNumber;
    }

    public static int sum(int...numbers) {
        int total = 0;
//        for (int number = 0; number < numbers.length; number++){
//            total += numbers[number];
//        }
        for(int addThisNumber : numbers){
            total += addThisNumber;
        }
        return total;
    }
}
