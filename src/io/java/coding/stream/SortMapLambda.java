package io.java.coding.stream;

import java.util.*;

public class SortMapLambda {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("two", 2);
        map.put("four",4);
        map.put("ten", 10);

        List<Map.Entry<String,Integer>> entryList = new ArrayList(map.entrySet());
        Collections.sort(entryList, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        for(Map.Entry<String,Integer> entry : entryList){
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }

       // map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);
      //  map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("--------");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        employeeMap.put(new Employee(176, "Roshan",  600000), 60);
        employeeMap.put(new Employee(388, "Bikash",  900000), 90);
        employeeMap.put(new Employee(470, "Bimal",  500000), 50);
        employeeMap.put(new Employee(624, "Sourav",  400000), 40);
        employeeMap.put(new Employee(284, "Prakash",  1200000), 120);

        System.out.println(employeeMap);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);



    }
}
