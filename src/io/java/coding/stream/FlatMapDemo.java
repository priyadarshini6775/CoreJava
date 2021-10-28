package io.java.coding.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        Stream<String[]> stream1 = Arrays.stream(array);
        //stream1.forEach(i -> System.out.println( i.length) );

        //both are same
        Stream<String[]> stream2  = Stream.of(array);
       // stream2.forEach(i -> System.out.println( i.length) );

     //Stream.of(array).flatMap(Stream::of).forEach(System.out::println);
       // Stream.of(array).flatMap(i -> Arrays.stream(i)).forEach(System.out::print);
        Stream.of(array).flatMap(i -> Stream.of(i)).forEach(System.out::print);



    }

}
