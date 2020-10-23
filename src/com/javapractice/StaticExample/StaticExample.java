package com.javapractice.StaticExample;

class StaticExample {

     static void staticfun()
    {
        System.out.println("Control is inside staticfun");

    }
    static {
        System.out.println("Inside 1st static block");
    }
    static {
        System.out.println("Inside 2nd static block");
    }

    public static void main(String args[])  {
        staticfun();
    }
}

