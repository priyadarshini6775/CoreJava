package io.java.coding.questions;

public class Recursion {
    public static void main(String[] args) {
        simpleRecursion(10);

    }
    public static void simpleRecursion(Integer n){
        if(n>0){
            System.out.println(n);
            simpleRecursion(n-1);
        }
    }
}
