package ChallengesFromOtherSources.Others;

public class SumOfFirst10NaturalNumbers {
    public static void main(String[] args) {
        int count = 1;
        int result = 0;

        for(; count <= 10; count+=2 ) {
            result = result + count;
            System.out.println(result);
        }
    }
}
