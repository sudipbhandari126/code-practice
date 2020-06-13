package com.sudip.code.standard.algo;


import java.util.ArrayList;

public class Heapify{
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        int[] array = {15, 6, 3, 8, 10, 9};
        minHeap.heapify(array);
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}

class MinHeap {
    /*
     * @param A: Given an integer array
     * @return: build a min-heap
     */
    public void heapify(int[] A) {
        for (int i = A.length / 2 - 1; i >= 0; i--)
            siftdown(A, i);
    }


    public void siftdown(int[] a, int i) {
        int len = a.length;
        int tmp = a[i];
        int index = i;
        while (i < len) {
            index = i;
            if (2 * i + 1 < len && tmp > a[2*i + 1])
                index = 2 * i + 1;
            if (2 * i + 2 < len && tmp > a[2*i + 2] && a[2*i + 1] > a[2*i + 2])
                index = 2 * i + 2;
            if (i == index) break;
            //swap
            a[i] = a[index];
            i = index;
        }
        a[index] = tmp;
    }
}
