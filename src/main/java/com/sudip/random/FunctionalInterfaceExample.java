package com.sudip.random;

import java.util.Random;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    int execute(int a, int b);

    default int randomNumber(){
        Random random = new Random();
        return random.nextInt(5);
    }


    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterfaceExample = ( (a, b)->  (a+b));
        System.out.println(functionalInterfaceExample.execute(4, 5));
        System.out.println(functionalInterfaceExample.randomNumber());

    }


}
