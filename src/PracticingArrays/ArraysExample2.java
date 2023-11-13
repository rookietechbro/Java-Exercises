package PracticingArrays;

import java.util.Arrays;

public class ArraysExample2 {
    public static void main(String[] args) {
        //method1: creating the array object before initializing each index of the array.
        int[] numbers = new int[3];
        numbers[0] = 12;
        numbers[1] = 22;
        numbers[2] = 32;
        System.out.println(Arrays.toString(numbers));
        System.out.println("The length of this array is " + numbers.length + ".");

        //method2:  creating and initializing the array object on the same line.
        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println("The length of this array numbers2 is " + numbers2.length + ".");
        System.out.println(Arrays.toString(numbers2));
        numbers2[3] = 44;
        System.out.println(Arrays.toString(numbers2));
    }
}