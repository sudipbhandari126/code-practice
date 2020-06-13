package com.sudip.code.leetcode;

import java.util.*;

public class ThirdMax {

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1, 1, 2}));
    }

    private static int thirdMax(int[] nums) {

        PriorityQueue<Integer> q = new PriorityQueue<>(3);

        for (Integer each: nums){
//            System.out.println("each= "+ each);
//            System.out.println("q.size= "+q.size());
//            System.out.println("q.poll= "+q.poll());
            q.poll();
//            //System.out.println("q.poll()==each= "+(q.poll()==each));
            if (q.size()>3 || each.equals(q.poll())) q.remove();
            q.add(each);
        }
//        q.offer()
        int len = q.size();
        if (len==3) return q.poll();
        if (len==2){q.remove(); return q.poll(); }
        //IdentityHashMap
        return q.poll();
    }
}
