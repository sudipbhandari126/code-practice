package com.sudip.random;

import java.util.*;

public class Hello {

//    private String reverse(String string){
//
//        int len = string.length();
//        StringBuilder stringBuilder = new StringBuilder(string);
//
//        for (int i=0, j=len-1; i<=j;){
//
//            if (!isSpecial(string.charAt(i)) && ! isSpecial(string.charAt(j))){
//                char temp = stringBuilder.charAt(i);
//                stringBuilder.setCharAt(i, stringBuilder.charAt(j));
//                stringBuilder.setCharAt(j,temp);
//
//            }
//
//            if (!isSpecial(string.charAt(i))){i++;}
//            if (!isSpecial(string.charAt(j))) {
//                j--;
//            }
//
//        }
//
//    }
//
//    private boolean isSpecial(Character c){
//        return true;
//    }



















    // 1 2 3

    //2 2 2

/*
    nlogn
    2 pair 0(n)



    // 1  2  3 4 5 6 7 8         15
       14 13


    i=0
    j=n-1

            (arr[i]+arr[j])

*/


    // target - indexValue


    // pair o(n)


    // 1 2 3 4 5 6 7





    private static  List<Integer> tripLet(int[] arr, int target){
        Arrays.sort(arr);
        Map<Integer, Integer> dualSumMap = new HashMap<>();
        for (int each: arr){
            dualSumMap.put(each,target-each);
        }
        for (int each: arr){
            Integer pairTarget = dualSumMap.get(each);
            List<Integer> search = search(arr, pairTarget);
            if (!search.isEmpty()) {
                search.add(each);
                return search;
            }
        }
        return Collections.emptyList();

    }

    private static List<Integer> search(int[] arr, Integer pairTarget) {
        for (int i=0,j=arr.length-1;i<=j;){

            int sum = arr[i]+arr[j];
            if (sum<pairTarget) {
                List<Integer> objects = new ArrayList<>();
                objects.add(arr[i]);
                objects.add(arr[j]);
                return objects;
            }
            if (sum>pairTarget){
                j--;
            }
            if (sum<pairTarget){
                i++;
            }

        }
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target = 10;
        tripLet(arr,target).forEach(System.out::print);

    }


}


/*
"a*c**b"


 mXn

 1  5  7

 8  9  10

 11 12 13















"b*c**a"

 :: "a*bcd"


        "d*cba"

  "a*b*d" : d *b*  a



   ab**d*:

   db**a*


    non repeated positive integers
    triplets: sum <


    for
        for
            for
                (sum)




 */




