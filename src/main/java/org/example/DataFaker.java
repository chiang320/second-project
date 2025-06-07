package org.example;

import net.datafaker.Faker;
import net.datafaker.providers.base.Weather;
import net.datafaker.providers.entertainment.GratefulDead;
import net.datafaker.providers.healthcare.Disease;

public class DataFaker {
    public static void main(String[] args) {
        Faker faker = new Faker();
//        String name = faker.name().fullName();
//        System.out.println(name);

        for (int i = 0; i < 10; i++) {
            String loopName = faker.name().fullName();
            System.out.println(loopName);
        }


        //隨機疾病
//          System.out.println(getAnyDisease(faker).anyDisease());


        //隨機籃球運動員
        System.out.println(faker.basketball().players());

    }

    private static String getRandomPlayer() {
        Faker faker = new Faker();
        return faker.basketball().players();

    }
}






