package io.java.coding.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingCharInString {
    public static void main(String[] args){
        //System.out.println(firstNonRepeatingCharacter("racecars"));
        System.out.println(firstUniqueChar("carsrace"));
    }

    public static int firstUniqueChar(String str){
        char[] charArray = str.toCharArray();
        //List<Character> nonRepeat[] = new ArrayList<Character>();
        for(int i=0; i<str.length(); i++ ){
             char c  = str.charAt(i);
             if( str.indexOf(c, i+1) < 0 ){
               return i;

             }
        }
        return -1 ;
    }


    public static int firstNonRepeatingCharacter(String str){
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        char[] chars = str.toCharArray(); // aba
        for(char ch : chars){
            characterFrequencyMap.put(ch, characterFrequencyMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : characterFrequencyMap.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        for(int i = 0; i < chars.length; i++){
            char ch = chars[i];
            if(characterFrequencyMap.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
}
