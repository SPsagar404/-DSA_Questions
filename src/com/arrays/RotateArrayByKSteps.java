package com.arrays;

public class RotateArrayByKSteps {

    public static void main(String[] args) {
        int[] arr={81,17,95,36,31,100,60};
        for(int element : rotateArrayByKSteps(arr,5)){
            System.out.print(element+" ");
        }
        System.out.println();
        for(int element : rotateArrayByKWithoutExtraSpace(arr,5)){
            System.out.print(element+" ");
        }
    }

    private static int[] rotateArrayByKSteps(int arr[],int k){
        int [] result = new int[arr.length];
        int count=0;
        for(int i = arr.length-k;i<arr.length;i++){
            result[count++] = arr[i];
        }
        for(int i=0;i<arr.length-k;i++){
            result[count++] =arr[i];
        }


        return result;
    }

    private static int[] rotateArrayByKWithoutExtraSpace(int[] arr, int k){
        k=k%arr.length;
        reverseArray(arr,0,arr.length-k-1);
        reverseArray(arr,arr.length-k,arr.length-1);
        reverseArray(arr,0,arr.length-1);
        return arr;
    }

    private static int[] reverseArray(int[] arr,int start,int end){
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
