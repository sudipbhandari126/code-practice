package com.sudip.code.javaconcepts;

public class VarArgs {
    public static void main(String[] args) {
        print();
        print("hi");
        print("hi","hello");
        print(new String[]{"hi","hello"});
        }

    private static void print(String... args){
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
