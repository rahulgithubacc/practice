package com.javapractice.StaticExample;

class StaticClass {

    static void staticfun() {
        System.out.println("Control is inside staticfun");
    }

    static {
        System.out.println("Inside 1st static block");
    }

    static {
        System.out.println("Inside 2nd static block");
    }

}
 class StaticExampple {
    public static void main(String args[])  {
        StaticClass.staticfun();
    }
}
//In case the main method and the static function/block are in the same class we do  not need anything to call the funtion;just the name of the funtion is enough
