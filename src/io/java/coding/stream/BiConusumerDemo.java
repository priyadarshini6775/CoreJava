package io.java.coding.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConusumerDemo implements BiConsumer<String,Integer> {

    @Override
    public void accept(String s, Integer i) {
        System.out.println("Input 1 " + s + "Input 2 " + i);
    }

    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer = new BiConusumerDemo();
        biConsumer.accept("Basant", 53000);

        //Anonymous Approach
        BiConsumer<String,Integer> biConsumer1 = new BiConsumer<String,Integer>(){
            @Override
            public void accept(String s, Integer i) {
                System.out.println("i 1 " + s + "i 2 " + i);
            }
        };
        biConsumer1.accept("Welcome", 5);

        //Lambda Approach
        BiConsumer<String,Integer> biConsumer2 = (i1 , i2) -> System.out.println("key --" + i1 + " Value--" +  i2);
        biConsumer2.accept("Priya", 786);

        Map<String, Integer> map=new HashMap<>();
        map.put("basant",5000);
        map.put("santosh",15000);
        map.put("javed",12000);

        map.forEach(biConsumer2);
        map.forEach((k,v) -> System.out.println(k + "--->" + v));

    }
}

