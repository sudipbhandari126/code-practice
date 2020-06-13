package com.sudip.code.gfg;

public class StringPermutation {

    public static void main(String[] args) {
        perm("abc","");
    }

    private static void perm(String input, String ansSoFar){
        if (input.length()==0){
            System.out.println(ansSoFar);
            return;
        }
        for (int i=0; i<input.length();i++){
            char ch = input.charAt(i);
            String stringExceptThis = input.substring(0,i)+input.substring(i+1);
            perm(stringExceptThis, ansSoFar+ch);
        }
    }
}
