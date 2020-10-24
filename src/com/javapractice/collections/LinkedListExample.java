package com.javapractice.collections;
import java.util.*;
public class LinkedListExample {
    public static void main(String args[])  {
        LinkedList<Integer>lst=new LinkedList<Integer>();
        //Create linked list by adding one by one items
        lst.add(1);
        lst.add(7);
        lst.add(6);
        lst.add(4);
        System.out.println(lst);
        //Adding elements at the beginning of the linked list
        lst.addFirst(2);
        System.out.println(lst);
        //Adding elements at the end of the linked list
        lst.addLast(10);
        System.out.println(lst);
        //Adding element to a specific position
        lst.add(2,3);
        System.out.println(lst);
        //Deleting elements
        lst.removeFirst();//Deletes the first element
        System.out.println(lst);
        lst.removeLast();//Deletes the element at the last index
        System.out.println(lst);
        lst.remove(3);//Deletes the fourth element
        System.out.println(lst);
    }
}
