package com.sudip.code.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationPhoneNumber {
    public static void main(String[] args) {
       List<List<Character>> mat = toLetters("234");
        System.out.println(mat);

//       for (int i=0;i<mat.size();i++){
//           for (int j=0;j<mat.get(i).size();j++){
//
//           }
//       }
        ArrayList<Object> objects = new ArrayList<>();
//        objects.toArray()
    }


        private  static List<List<Character>> toLetters(String digits){
            List<List<Character>> ans = new ArrayList<>();
            for (char c: digits.toCharArray()){
                if (c=='2') ans.add(Arrays.asList('a','b','c'));
                if (c=='3') ans.add(Arrays.asList('d','e','f'));
                if (c=='4') ans.add(Arrays.asList('g','h','i'));
                if (c=='5') ans.add(Arrays.asList('j','k','l'));
                if (c=='6') ans.add(Arrays.asList('m','n','o'));
                if (c=='7') ans.add(Arrays.asList('p','q','r','s'));
                if (c=='8') ans.add(Arrays.asList('t','u','v'));
                if (c=='9') ans.add(Arrays.asList('w','x','y','z'));
            }
            return ans;
        }
    }

