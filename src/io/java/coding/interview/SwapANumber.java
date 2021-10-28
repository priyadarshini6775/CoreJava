package io.java.coding.interview;

public class SwapANumber {
    public static void main(String[] args) {
        int num = 127;
        swap(num);

    }
    public static void swap(int num){
        int swapNum = 0;
        while( num >= 1 ){
            int mod = num % 10;
            num = num / 10;
            swapNum = swapNum * 10 + mod ;
        }
        System.out.println(swapNum);

    }
}
