package org.example;

import java.util.HashSet;

public class CollectionTwo {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("小華華");
        names.add("小明明");
        for (String name : names) {

            System.out.println("幾歲" + names);
        }
    }
}
