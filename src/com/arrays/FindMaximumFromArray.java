package com.arrays;

public class FindMaximumFromArray {

    public static void main(String[] args) {
        int[] arr={81,17,95,36,31,100,60};
        int maximumElement = findMaximumElement(arr);
        System.out.println("Maximum Element :: "+maximumElement);
    }

    private static int findMaximumElement(int[] arr){
        int maxElement = Integer.MIN_VALUE;
        for(int element : arr){
            if(element > maxElement){
                maxElement = element;
            }
        }
        return maxElement;
    }
}
