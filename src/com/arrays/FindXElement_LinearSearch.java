package com.arrays;

public class FindXElement_LinearSearch {
    public static void main(String[] args) {
        int[] arr={81,17,95,36,31,100,60};
        int index = findElement(18, arr);
        System.out.println("Element index :: "+index);
    }

    private static int findElement(int element,int[] arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == element)
                return i;
        }

        return -1;
    }
}
