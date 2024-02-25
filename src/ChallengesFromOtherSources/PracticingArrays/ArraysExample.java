package ChallengesFromOtherSources.PracticingArrays;

public class ArraysExample {
    public static void main(String[] args) {
        double[] a = new double[3];
        for (int i = 0; i < 3; i++)
            a[i] = Math.random();

        for(int i = 0; i < 3; i++)
            System.out.println(a[i]);
    }
}
