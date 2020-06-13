package com.sudip.code.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;


/*
295. Find Median from Data Stream
Hard

2302

44

Add to List

Share
Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

For example,
[2,3,4], the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

void addNum(int num) - Add a integer number from the data stream to the data structure.
double findMedian() - Return the median of all elements so far.


Example:

addNum(1)
addNum(2)
findMedian() -> 1.5
addNum(3)
findMedian() -> 2


Follow up:

If all integer numbers from the stream are between 0 and 100, how would you optimize it?
If 99% of all integer numbers from the stream are between 0 and 100, how would you optimize it?
 */

class RunningMedian {

    /*
    Main Idea is to always have 2 halves of the input data (one in min heap, another in max heap).. top 2 elements would be
    adjacent to each other..
     */
    /** initialize your data structure here. */
    PriorityQueue<Integer> lowers;
    PriorityQueue<Integer> highers;
    private double currentMedian;
    public RunningMedian() {
        lowers = new PriorityQueue<>(Collections.reverseOrder());
        highers = new PriorityQueue<>();
    }

    public void addNum(int num) {
        addNumber(highers,lowers,num);
        rebalance(highers,lowers);
        currentMedian=findMedian(highers,lowers);

    }

    public double findMedian() {
        return currentMedian;
    }

    private void addNumber(PriorityQueue<Integer> higher, PriorityQueue<Integer> lower, Integer num){
        if (lower.isEmpty() || num < lower.peek()){
            lower.add(num);
        } else higher.add(num);
    }

    private void rebalance(PriorityQueue<Integer> higher, PriorityQueue<Integer> lower){
        PriorityQueue<Integer> smaller = (higher.size()<lower.size())? higher:lower;
        PriorityQueue<Integer> bigger = (higher.size()>lower.size())? higher:lower;

        if (bigger.size()-smaller.size() > 1){
            smaller.add(bigger.remove());
        }
    }

    private double findMedian(PriorityQueue<Integer> higher, PriorityQueue<Integer> lower){
        PriorityQueue<Integer> smaller = (higher.size()<lower.size())? higher:lower;
        PriorityQueue<Integer> bigger = (higher.size()>lower.size())? higher:lower;
        if (bigger.size()>smaller.size()){
            return bigger.peek();
        } else {
            return (double) (smaller.peek() + bigger.peek()) / 2;
        }
    }


    //This is a more simplified way
    public   void addNumSimplified (int num) {
        lowers.add(num);
        highers.add(lowers.peek());
        if (highers.size()> lowers.size()){
            lowers.add(highers.poll());
        }
        if (lowers.size()==highers.size()){
            currentMedian = (lowers.peek()+highers.peek())/2.0;
        } else  currentMedian = highers.peek();

    }

    public static void main(String[] args) {
        RunningMedian runningMedian = new RunningMedian();
        runningMedian.addNum(4);
        runningMedian.addNum(5);
        System.out.println(runningMedian.findMedian());
    }

}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
