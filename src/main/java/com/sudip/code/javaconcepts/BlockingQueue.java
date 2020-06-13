package com.sudip.code.javaconcepts;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class BlockingQueue {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(5);

        arrayBlockingQueue.add("hi");
        arrayBlockingQueue.add("hi");
        arrayBlockingQueue.add("hi");
        arrayBlockingQueue.add("hi");
        arrayBlockingQueue.add("hi");
        arrayBlockingQueue.add("hi");
        arrayBlockingQueue.add("hi");


    }

}
