package io.java.coding.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceDemo {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(3, 5, 8, 1, 5, 9);
        List<String> strList = Arrays.asList("coreJava", "springboot", "hibernate");
        int sum = 0;
        for(int i : numList){
            sum = sum + i;
        }
        System.out.println(sum);

        int sum1 = numList.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        Integer reduceSum = numList.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumMethodRef = numList.stream().reduce(Integer::sum);
        System.out.println(reduceSumMethodRef.get());

        Integer reduceProd = numList.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduceProd);

        Integer maxNum = numList.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxNum);

        Optional<Integer> maxMethodRef = numList.stream().reduce(Integer::max);
        System.out.println(maxMethodRef.get());

        Optional<String> longestWord = strList.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2);
        System.out.println(longestWord.get());


    }
}
