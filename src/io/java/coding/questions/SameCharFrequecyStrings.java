package io.java.coding.questions;

import java.util.*;
import java.util.stream.Collectors;

public class SameCharFrequecyStrings {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("aabbccdd", "aaabccdd", "bacddcab", "bbdadcca");
        System.out.println(inputList);
        System.out.println( checkSameCharacterFrequecy( inputList));

    }

    private static String  checkSameCharacterFrequecy(List<String> inputList) {
        Map<String, Integer> strLengthMap = new HashMap<String, Integer>();
        List<Character> charList = Arrays.asList('a', 'b', 'c','d');
        String outMessage = null;
        boolean charCheckFlag = true;

        //checking if all the strings are of same length
        for(String str : inputList){

            strLengthMap.put(str, str.length());
        }
        int strLength =  strLengthMap.values().stream().distinct().collect(Collectors.toList()).size();


        // checking for only letters abcd
        for(String str : inputList){
           for(int i=0; i<str.length(); i++){
               char inputChar = str.charAt(i);
               if ( !charList.contains(inputChar)){
                   charCheckFlag = false;
               }
           }
        }
        if(strLength != 1){
            outMessage =  "Strings are not equal length";
        }
        if(charCheckFlag == false){
            outMessage =  "Strings are having unknown characters ";
        }

        //checking for
        if (strLength == 1 && charCheckFlag == true){
            Map<String,Map<Character, Integer>> outMap = new HashMap<>();
            for(String str : inputList){
                char[] charArray = str.toCharArray();
                Map<Character ,Integer> charFreqMap = new HashMap<Character, Integer>();
                for(char c  : charArray){
                    charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
                }
                outMap.put(str, charFreqMap);

            }
            //int size = outMap.values().stream().distinct().collect(Collectors.toList()).size();
            //System.out.println(size);
            //checking each char appears 2 times in a string
            for(String  str : inputList){
                //System.out.println(str );
                long count = outMap.get(str).values().stream().filter(i -> i != 2).count();
                if(count != 0) {
                    return str;
                }
             }
            return "All are having same Frequency";
        }else{
            return outMessage;
        }

        //return null;
    }
}

