package com.arrays;

public class CountTheNoOfElementGreaterThanX {

    public static void main(String[] args) {
        int[] arr={81,17,95,36,31,100,60};
        int noOfElement = countTheNoOfElementGreaterThanX(arr, 32);
        System.out.println("No of element greater the x :: "+noOfElement);
    }

    private static int countTheNoOfElementGreaterThanX(int[] arr, int x){

        int count =0;
        for(int element : arr){
            if(element>x){
                count++;
            }
        }
        return count;
    }
}
