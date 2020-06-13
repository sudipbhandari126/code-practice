package com.sudip.random;

public class Simple {

    // Complete the maxDiscount function below.
    static long maxDiscount(int n, int x, int y, int a, int b) {
        int discount=0;

        int max = Math.max(a,b);


        discount += a*(n/x);

        discount += b* (n/y);



        discount += max* (n/(x*y));
        return discount;


    }

    public static void main(String[] args) {
        System.out.println(maxDiscount(8, 4, 3, 1, 2));
    }
}
