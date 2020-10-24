package com.javapractice.inheritance;

public class Car{

    public static void main(String args[]) {
        Car car = new SUV();
        car.speedUp();


    }

    public Car() {
        System.out.println("Making a simple car");
    }


    public void speedUp() {
        System.out.println("80KMPH within 60 sec");
    }

}

class SUV extends Car{
    public SUV() {
        System.out.println("Making a SUV");
    }

    @Override
    public void speedUp() {
        System.out.println("80KMPH within 10 sec");

    }

}

