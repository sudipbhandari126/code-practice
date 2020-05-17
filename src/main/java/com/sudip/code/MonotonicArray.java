package com.sudip.code;

public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        int len = A.length;
        if (A[0]>A[len-1]){
            //all should be decreasing
            int prev=A[0];
            for (int i=1;i<len;i++){
                if (A[i]>prev) return false;
                prev=A[i];
            }
        } else{
            //all should be increasing
            int prev=A[0];
            for (int i=1;i<len;i++){
                if (A[i]<prev) return false;
                prev=A[i];
            }
        }
        return true;
    }
}
