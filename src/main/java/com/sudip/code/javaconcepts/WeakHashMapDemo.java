package com.sudip.code.javaconcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<Person,String> map = new WeakHashMap<>();

        System.out.println("weak reference");
        for (int i=0;i<100;i++)
            map.put(new Person(i,"ram"),"something");

        Person sldfjkdklf = new Person(49, "sldfjkdklf");
        map.put(sldfjkdklf,"sldkjfldf");

        System.out.println("before gc="+map.size());
        System.gc();
        Thread.sleep(5000);
        System.out.println("after gc (hopefully)="+map.size());

        System.out.println("strong reference");
        Map<Person,String> strongMap = new HashMap<>();
        Person[] persons = new Person[100];
        for (int i=0;i<100;i++){
            Person something = new Person(i, "something");
            persons[i]=something;
            strongMap.put(persons[i],"some randomthing");
        }

        System.out.println("before gc="+strongMap.size());
        System.gc();
        Thread.sleep(5000);
        System.out.println("after gc (hopefully)="+strongMap.size());

    }

}


class Person{
    Integer id;
    String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
