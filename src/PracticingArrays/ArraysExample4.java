package PracticingArrays;

import java.util.Arrays;

public class ArraysExample4 {
    public static void main(String[] args) {
        String[] shoes = new String[5];
        System.out.println(Arrays.toString(shoes));
        shoes[2] = "toms";
        shoes[4] = "gucci";
        System.out.println(Arrays.toString(shoes));
        Arrays.fill(shoes, "flipflop");
        System.out.println(Arrays.toString(shoes));
        shoes[2] = "toms";
        shoes[4] = "gucci";
        System.out.println(Arrays.toString(shoes));
    }
}
