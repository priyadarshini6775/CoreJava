package io.java.coding.String;

public class StringObject {
    public static void main(String[] args) {
        //how many object created here
        String s1=new String("javatechie");
        //1 object -> new -> heap
        //2 object -> literal -> SCP (String constant pool area)

        String s2="javatechie";
        // intern method used to get reference from SCP
        System.out.println(s1.intern());
        System.out.println(s1.intern().hashCode()==s2.hashCode());

        //total object count 2

        System.out.println("---------");

        String s3 = new String("Test");
        String s4 = new String("Test");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.intern().hashCode()==s4.intern().hashCode());


    }
}
