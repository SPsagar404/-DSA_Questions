package com.arrays;

public class SumOfAllElements {

    public static void main(String[] args) {

        int[] arr={81,17,95,36,31,100,60};
        int sum = calculateSumOfElemets(arr);
        System.out.println("sum of elements :: "+sum);
    }

    private static int calculateSumOfElemets(int[] arr){
        int sum = 0;
        for (int element : arr){
            sum+=element;
        }

        return sum;
    }
}
