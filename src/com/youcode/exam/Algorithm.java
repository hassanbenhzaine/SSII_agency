package com.youcode.exam;

import java.util.Arrays;

public class Algorithm {
    public static int findLargest(int[] numbers) {
        // sort the array first
        Arrays.sort(numbers);

        // Return last element of array
        return numbers[numbers.length-1];
    }

    public static void main(String[] args) {
        int[] numbers = {1,-28,88,300,600};
        int result = Algorithm.findLargest(numbers);
        System.out.println(result);
    }
}