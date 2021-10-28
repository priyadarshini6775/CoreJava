package io.java.coding.parentChild;

public class ParentChildScenario {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.sayHello();
        parent.greet();

        Child child = new Child();
        child.sayHello();
        child.greet();
    }

}
