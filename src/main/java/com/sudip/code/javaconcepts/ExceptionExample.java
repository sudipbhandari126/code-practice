package com.sudip.code.javaconcepts;

public class ExceptionExample {
    public static void main(String[] args) {
        method();
    }

    private static void method(){
        try {
            throw new RuntimeException("from method body");
        }catch (Exception e){
            throw new RuntimeException("from catch");
        } finally {
            throw new RuntimeException("from finally");
        }
    }
}

/*
Output:

Exception in thread "main" java.lang.RuntimeException: from finally
	at com.sudip.code.javaconcepts.ExceptionExample.method(ExceptionExample.java:14)
	at com.sudip.code.javaconcepts.ExceptionExample.main(ExceptionExample.java:5)
 */