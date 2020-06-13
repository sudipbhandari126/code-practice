package com.sudip.random;

public class MultipleInheritence  implements one,two{

    @Override
    public void method() {
        one.super.method();
        two.super.method();
    }

    public static void main(String[] args) {
        MultipleInheritence multipleInheritence = new MultipleInheritence();
        multipleInheritence.method();
    }
}


interface one {
default void method(){
    System.out.println("one default");
};
}

interface two{
    default void method(){
        System.out.println("two default");
    };
}
