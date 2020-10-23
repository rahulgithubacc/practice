package com.javapractice.Inheritnce;

 class parent {
     parent() {
         System.out.println("Base version");
     }
 }
 class child extends parent {
         child() {
             System.out.println("Child version");
         }
 }

class inheritance   {
     public static void main(String args[]) {
        new child();
     }
}