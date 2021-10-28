package io.java.coding.exception;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        System.out.println(m1());
    }

    public static int m1(){
        try{
            System.out.println("hello Charan! You are the best person and I wish I could be like you!");
            System.out.println("hello Shanvi, I would love to buy face painting kit!!!!");
            return 1;

        }catch (Exception ex){
            return 2;
        }
//        finally {
//            return 3;
//        }
    }
}
