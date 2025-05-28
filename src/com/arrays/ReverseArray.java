package com.arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr={81,17,95,36,31,100,60};
        arr = reverseArray(arr);
        for (int element : arr){
            System.out.print(element+" ");
        }

    }

    private static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}
