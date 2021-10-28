package io.java.coding.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListLambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        Collections.sort(list);
        Collections.reverse(list);
        //System.out.println(list);

        //list.stream().sorted().forEach(System.out::println);
        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Basant", 73000));
        employeeList.add(new Employee(2,"John", 35000));
        employeeList.add(new Employee(3,"Kean", 45000));

        //employeeList.stream().forEach(System.out::println);
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //return o2.getSalary() - o1.getSalary();
                return o1.getSalary() > o2.getSalary() ? 1 : -1;
            }
        });
        //employeeList.stream().forEach(System.out::println);

       // employeeList.stream().sorted((o1,o2) -> o2.getSalary()-o1.getSalary()).forEach(System.out::println);

       // employeeList.stream().sorted(Comparator.comparing(emp ->  emp.getSalary()    )).forEach(System.out::println);
        employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);






    }
}
