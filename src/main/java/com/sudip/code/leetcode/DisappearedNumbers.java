package com.sudip.code.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {

    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        findDisappearedNumbers(arr).forEach(System.out::println);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;

        for (int i =0 ; i< len ; i++){
            if (nums[i]!=-1) nums[nums[i]-1]=-1;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<len;i++){
            if (nums[i]!=-1) ans.add(i+1);
        }
        return ans;
    }


}
