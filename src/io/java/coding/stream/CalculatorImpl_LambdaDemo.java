package io.java.coding.stream;


interface Calculator{
     void sayHello();



}
public class CalculatorImpl_LambdaDemo {



    public static void main(String[] args) {
     Calculator calculator = () -> System.out.println("hello Lambda");
     calculator.sayHello();
    }
}
