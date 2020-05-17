package com.sudip.code;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/*
414. Third Maximum Number
Easy

588

1091

Add to List

Share
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 */

public class ThirdLargestUsingHeap {
        public static int thirdMax(int[] nums) {


            Set<Integer> uniqs = new HashSet<>();
            for (int each: nums){
                uniqs.add(each);
            }
            PriorityQueue<Integer> q = new PriorityQueue<>(3);

            for (int each: uniqs){
                if (q.size()==3 ) q.remove();
                q.add(each);
            }
            int len = q.size();
            if (len==3) return q.poll();
            if (len==2){q.remove(); return q.poll(); }
            return q.poll();
        }

    public static void main(String[] args) {
        int[] array = {1,2,2,5,3,5};
        System.out.println(thirdMax(array));
    }

}
