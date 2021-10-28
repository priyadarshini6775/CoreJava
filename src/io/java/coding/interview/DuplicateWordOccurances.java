package io.java.coding.interview;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateWordOccurances {
    public static void main(String[] args) {
        String str = "I am am Working on On On On Java";
        getDuplicateOccurances(str);

    }
    public static void getDuplicateOccurances(String str){

        StringTokenizer st = new StringTokenizer(str, " ");
        Map<String, Integer> map = new HashMap<>();




//        while(st.hasMoreTokens()){
//            String token = st.nextToken();
//            map.put(token, map.getOrDefault(token, 0)+1);
//        }

        String[] s = str.split(" ");

        for(int i=0; i<s.length; i++){
            map.put(s[i], map.getOrDefault(s[i], 0)+1);
        }
        int max = Collections.max(map.values());
        List<String> list = map.entrySet().stream()
                        .filter(entry -> entry.getValue() == max)
                        .map(entry ->entry.getKey())
                        .collect(Collectors.toList());

        list.stream().forEach(i -> System.out.println( i + " ---- " +map.get(i) ));


    }

}

