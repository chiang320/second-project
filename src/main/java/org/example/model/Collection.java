package org.example.model;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List<String> studentName = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = faker.name().fullName();
            studentName.add(name);
            System.out.println(name);
        }
        for (String name : studentName) {
            System.out.println(name);
        }
        //Array.length
        System.out.println("學生總數:" + studentName.size());
        //array[]
        System.out.println("第一位學生:" + studentName.get(0));
        //array[array.length-1]
        System.out.println("最後一位學生:" + studentName.get(studentName.size() - 1));

        String newName = faker.name().fullName();
        System.out.println("將第三位學生改為:" + newName);
        studentName.set(2, newName);

        System.out.println("移除第五位學生:" + studentName.get(4));
        studentName.remove(4);
        studentName.add(studentName.get(0));
        studentName.add(studentName.get(0));
        studentName.add(studentName.get(0));
        studentName.add(studentName.get(0));
        System.out.println("最終名單為:");
        for (String name : studentName) {
            System.out.println(name);
        }
    }
}

