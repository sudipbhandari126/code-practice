package com.sudip.random;

import java.util.Arrays;
import java.util.List;

public class Substitute {

    static String mutualSubstitutions(String s, List<Character> subFirst, List<Character> subSecond) {
        char[] schars = s.toCharArray();

        int[] reverted = new int[s.length()];
        //subFirst by subSecond
        for (int i =0; i<subFirst.size();i++){

            char c = subFirst.get(i);
            for (int j = 0; j<schars.length;j++){
                if (schars[j]==c){
                    schars[j]=subSecond.get(i);
                    reverted[i]=1;
                }
            }

        }


        //subFirst by subSecond
        for (int i =0; i<subSecond.size();i++){

            char c = subSecond.get(i);
            for (int j = 0; j<schars.length;j++){
                if (schars[j]==c){
                    if (reverted[i]!=1)
                    schars[j]=subFirst.get(i);

                }
            }

        }

        return new String(schars);

    }

    public static void main(String[] args) {
        List<Character> c = Arrays.asList('c');
        List<Character> o = Arrays.asList('o');
        System.out.println(mutualSubstitutions("coder", c, o));
    }
}
