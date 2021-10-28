package io.java.coding.questions;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueQuestion {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(11);
        p.add(10);
        p.add(23);
        p.add(7);
        p.add(12);
        p.add(3);
        while(p.isEmpty() == false){
            System.out.println( p.remove());

        }

        PriorityQueue<String> s = new PriorityQueue<>();
        s.add("A");
        s.add("C");
        s.add("G");
        s.add("F");
        s.add("G");
        s.add("B");

        System.out.println(s);

        Iterator itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println( "-------");
        while(s.isEmpty() == false){
            System.out.println( s.remove());


        }

    }
}
