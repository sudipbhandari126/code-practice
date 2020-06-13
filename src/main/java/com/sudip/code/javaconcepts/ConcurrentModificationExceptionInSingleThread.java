package com.sudip.code.javaconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentModificationExceptionInSingleThread {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("hi","bye");
//        map.put("hello","goodbye");

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(map.get(next));
            map.put("random","random");
        }

        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }

    }
}
