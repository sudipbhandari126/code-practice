package com.sudip.code.leetcode;

/*
Two observations:

Flips are commutative. You'll get the same result regardless of what order you do them in.

At some point you have to flip the most significant bit that doesn't match

This gives us a handy greedy argument. We will always get the optimal solution by flipping the leftmost bit that needs to be flipped. At some point we have to flip that bit, and the order doesn't matter so we might as well do it first.

Implementing this to be O(N) can be tricky - if we flip everything naively we end up with an O(N) flip which gives an O(N^2) solution. We can note that in determining the true value of the current bit, we only care about the number of flips that have already occurred. If this number is odd then the value of that bit is flipped. Otherwise it is unchanged.

We can then make a final observation to make life a lot easier:

Flips cancel each other out. Instead of asking how many flips it takes to get from 0 to the target, let's ask how many flips it takes to get from the target to 0. Whenever the true value of a bit is not equal to zero, we simply add a flip.

https://stackoverflow.com/questions/58029234/given-a-binary-string-with-all-0s-covert-it-in-the-target-string
 */

public class BitFlips {

    public static void main(String[] args) {
        System.out.println(theFinalProblem("00101"));
    }

    public static int theFinalProblem(String target) {
        // Write your code here
        char[] chars = target.toCharArray();
        int result =0;

        for (char each: chars){

            int i = (int) (each-'0');

            if (result%2==0){
                if (i!=0) result++;
            }else{
                if (!(i!=0)) result++;
            }

        }

        return result;

    }

}
