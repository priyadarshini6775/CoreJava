package io.java.coding.questions;

import java.util.Arrays;

public class SquaresAndSortedArray {
    public static void main(String[] args){
        int[] numArray = {-4,-1,10,7,3};// [0,1,9,16,100]
        //squaresAndSortedUsingJava8(numArray);
        squaresAndSorted(numArray);
        //Arrays.stream(sortedSquares(numArray)).forEach(System.out:: println);
    }

    public static void  squaresAndSortedUsingJava8(int[] numArray){
        int[] squaredArray = Arrays.stream(numArray).map(i -> i*i).sorted().toArray();
        Arrays.stream(squaredArray).forEach(e -> System.out.println(e));
//        System.out.print("[");
//        for(int i : squaredArray){
//            System.out.print(i + ", ");
//        }
//        System.out.println("]");
    }

    public static int[] sortedSquares(int[] arr) {
        // Two pointer technique
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int[] result = new int[n];

        // {-4, -1, 0, 3} -> {0, 1, 9, 16}

        for (int k = n - 1; k >= 0; k--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[k] = arr[i] * arr[i];
                i++;
            } else {
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        return result;
    }

    public static void  squaresAndSorted(int[] numArray){
        int[] squaredArr = new int[numArray.length];

        for(int i=0; i<numArray.length; i++){
            squaredArr[i] = numArray[i] * numArray[i];
        }
        //Arrays.stream(squaredArr).forEach(System.out::println);

        for(int i=0; i<squaredArr.length-1; i ++ ){
             for(int j=i+1; j<=squaredArr.length-1; j++ ){
                 if(squaredArr[i] > squaredArr[j]){
                     int temp = squaredArr[i];
                     squaredArr[i] = squaredArr[j];
                     squaredArr[j] = temp;
                 }
             }

        }

       Arrays.stream(squaredArr).forEach(System.out::println);



    }

}
