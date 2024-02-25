package AssignmentOnLoops;

public class SumOfFirst10NaturalNumbers {
    public static void main(String[] args) {
        int total = 0;
        for(int number = 0; number <= 10; number++) {
            total += number;
        }
            System.out.print("The sum of the first natural numbers is " + total + ".");
    }
}
