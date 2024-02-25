package ChallengesFromOtherSources.AssignmentOnLoops;

public class SumOfFirst10NaturalNumbers {
    public static void main(String[] args) {
        int total = 0;
        for(int count = 1; count <= 10; count++) {
            total += count;
        }
            System.out.print("The sum of the first 10 natural numbers is " + total + ".");
    }
}
