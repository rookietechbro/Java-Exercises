package ChallengesFromOtherSources.PracticingArrays;

import java.util.Arrays;

public class ArraysExample3 {
    public static void main(String[] args) {
        double[] heights = new double[4];
        heights[0] = 1.2;
        heights[1] = 1.3;
        heights[2] = 1.4;
        heights[3] = 1.5;
        System.out.println(Arrays.toString(heights));
        System.out.println(heights.length);

        double[] heights2= {1.2, 1.3, 1.4, 1.5, 1.6, 1.7};
        System.out.println(heights2.length);
    }
}
