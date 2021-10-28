package io.java.coding.questions;

public class StringComparision {
    public static void main(String[] args){
        String e1 = "Kundan";
        String e2 = "Kundan";
        String e3 = e1;
        int a= 10;
        int b = a;
        a=12;

        if(a == b ) System.out.println("equal numbers");
        else {
            System.out.println("not equeal numbers");
        }

        if(e1==e2){
            System.out.println("Equal References");

        }else{
            System.out.println("Not Equal References");
        }
        if(e2.equals(e1)){
            System.out.println("Equal Objects");
        }else{
            System.out.println("Not Equal Objects");
        }

        e1 = "Radhika";
        if(e1.equals(e3)){
            System.out.println("e1, e3 Equal Objects");
        }else{
            System.out.println("e1, e3 not Equal Objects");
        }




    }

}
