
package com.javapractice.collections;
import java.util.ArrayList;
import java.util.Collections;

class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<Integer> arl = new ArrayList<Integer>();
        //Adding elements to the ArrayList
        arl.add(1);
        arl.add(2);
        arl.add(3);
        System.out.println(arl);
        //Adding an element at a specified position
        arl.add(0,5);
        System.out.println(arl);
        System.out.println(arl.size());//Size of the arraylist
        //Change an element
        arl.set(1,7);
        System.out.println(arl);
        //Delete an element
        arl.remove(2);
        System.out.println(arl);
        //Traversing through the ArrayList
        for(Integer i:arl)
            System.out.println(i);
    }
}
