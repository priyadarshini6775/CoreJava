package io.java.coding.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class RemoveVowelsFromString {
    public static void main(String[] args){


        //System.out.println(removeVowels("ice cream"));
        removeVowels1("ice cream");


    }

    private static String removeVowels(String inputString) {

        StringBuilder str = new StringBuilder();
        Set s = Set.of('a','e', 'i','o','u');
        char[] charArray = inputString.toCharArray();

       for(char c : charArray ){
           if(!s.contains(c)){
               str.append(c);
           }
       }
        return str.toString();
    }

    public static void removeVowels1(String str){
        Set vowelSet = Set.of('a', 'e', 'i', 'o','u');
        String noVowelString = "";
        for(int i=0; i<str.length(); i++){
            if(!vowelSet.contains(str.charAt(i))){
                noVowelString = noVowelString + str.charAt(i);
                System.out.println(noVowelString);
            }
        }
        System.out.println(noVowelString);


    }
}
