package io.java.coding.stream;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {
    public static void main(String[] args){
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        numList.stream().filter(i -> i >3).forEach(i -> System.out.println(i));

    }
}
