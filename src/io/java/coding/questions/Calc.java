package io.java.coding.questions;

public class Calc {
    int i = 100;
    public void add(int num){
        this.i = num *10;
    }
    public void sop(){
        System.out.println(i);
    }
    public static void main(String[] args){
        Calc c = new Calc();
        c.add(3);
        c.sop();



    }
    
}
