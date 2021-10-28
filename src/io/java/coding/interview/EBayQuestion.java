package io.java.coding.interview;

import java.io.*;
import java.util.*;




/*
 * given an input integer, we want to reverse the integer
 * 123 -> 321
 * 120 -> 12
 *
 * nums = [-1,0,1,2,-1,-4] -> all the triplets nums[i] + nums[j] + nums[k] = 0, i != j != k -> i, j, k need not be consecutive


 */

class EBayQuestion {
    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};

        for(int i=0; i<nums.length-2; i++){

            for(int j=i+1;j<nums.length-1;j++){

                for(int k=j+1; k<nums.length; k++){

                    int sum= nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        System.out.println("{"+nums[i]+","+nums[j]+","+nums[k]+"}");
                    }
                }

            }
        }
    }

}


// [1,3,2,3,5,4] > (size/2)
// [1,2,3,4,5,6] create a binary search tree from this array
// [1,3,5] [2,4]  -> [1,2,3,4,5]
// O(nlogn)
// O(n)

// [5,8,9] [14,15] 5 14 15