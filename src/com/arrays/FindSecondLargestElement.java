package com.arrays;

public class FindSecondLargestElement {

    public static void main(String[] args) {
        int[] arr={81,17,95,36,31,100,60,100};
        int secondLargestElement = findSecondLargestElement(arr);
        System.out.println("Second Largest :: "+secondLargestElement);
    }

    private static int findSecondLargestElement(int[] arr){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int element : arr){
            if(element > firstLargest){
                secondLargest = firstLargest;
                firstLargest = element;
            }else if(element> secondLargest && element != firstLargest ){
                secondLargest = element;
            }
        }
        return secondLargest;
    }
}
