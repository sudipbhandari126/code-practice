package com.sudip.random;

import java.util.*;

public class Simpl {


    /*
     [5,2, 3, 1]
     7
     */
    public static void main(String[] args) {
        findSumIndices(new int[]{5,2,3,1},8).forEach(System.out::println);
    }

    private static List<Integer> findSumIndices(int[] arr, int sum){
        //diff->index
        Map<Integer,Integer> map = new HashMap<>();
        // 5 2 3 1 : sum = 7
        /*
        5->  2
        2 -> 5
        */
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length;i++){
            int diff = sum - arr[i];
            if (map.get(arr[i])!=null){
                list.add(map.get(arr[i]));
                list.add(i);
            }

            map.put(diff,i);

        }
        return list;
    }



    /*



     */
    int RATE_LIMIT=100;  //per minute

    private static boolean shouldWaitLimit(int requestPerSecond){
        //record time and number of requests
        TreeMap<Date,Integer> map = new TreeMap<>();

        /*
        01:01 == 5
        01:06 == 4

        01: 4
        ....
        ...
         */
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.MINUTE,-1);
        Date time = instance.getTime();

        /*

        01:01:01 == 0


        01:07:01 == 3

        01:08:01 == 0


         */

        for (Date date : map.keySet()) {

        }

        /*
        1:00:00 => 50

        1:00:58 => 50

        1: 01: 30 => 50

         */




        //timeStamp:: numberOfRequest

        // numberofRequestsIn(60) > RATE_LIMIT return false



        return false;
    }




}
