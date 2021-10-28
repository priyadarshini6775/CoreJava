package io.java.coding.stream;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };

        System.out.println(biPredicate.test("madam", "madam"));

        BiPredicate<String, String> equalsPredicate = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> lengthPredicate = (s1, s2) -> s1.length()==s2.length();
        System.out.println("Testing both the conditions---" + lengthPredicate.and(equalsPredicate).test("Hello", "Hello"));


    }
}
