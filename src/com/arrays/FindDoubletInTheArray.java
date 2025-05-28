package com.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindDoubletInTheArray {

    public static void main(String[] args) {
        int[] arr={81,17,95,36,31,100,60};
        int[] doubletFromArray = findDoubletFromArray(arr, 48);
        for (int i : doubletFromArray) {
            System.out.print(i+" ");
        }
        System.out.println();
        doubletFromArray = findDoublet(arr, 48);
        for (int i : doubletFromArray) {
            System.out.print(i+" ");
        }

        System.out.println();
        doubletFromArray = findDuplete(arr, 48);
        for (int i : doubletFromArray) {
            System.out.print(i+" ");
        }

    }

    private static int[] findDoubletFromArray(int[] arr,int sum ){

        int[] result =new int[2];

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == sum){
                    result[0] =i;
                    result[1] =j;
                }
            }
        }
        return result;
    }

    private static int[] findDoublet(int[] arr, int x){
        int[] result = new int[2];

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){

            int complement = x-arr[i];
            if(set.contains(complement)){
                result[0] = complement;
                result[1] = arr[i];
                return result;
            }
             set.add(arr[i]);
        }
        return result;
    }

    private static int[] findDuplete(int[] arr,int x){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement = x -arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);

        }

        return null;
    }
}
