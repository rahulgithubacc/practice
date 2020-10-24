package com.javapractice.inheritance;

 class Parent {
     Parent() {
         System.out.println("Base version");
     }
 }
 class Child extends Parent {
         Child() {
             System.out.println("Child version");
         }
 }

class Inheritance   {
     public static void main(String args[]) {
        Child ch= new Child();
     }
}