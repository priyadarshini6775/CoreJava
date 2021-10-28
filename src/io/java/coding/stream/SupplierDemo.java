package io.java.coding.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args){
        Supplier<String> supplier = () -> "Hello there";
        List<String> strList = Arrays.asList();
        System.out.println(strList.stream().findAny().orElseGet(supplier));



    }

}
