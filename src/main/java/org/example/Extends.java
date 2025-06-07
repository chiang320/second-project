package org.example;

import org.example.model.Dog;

public class Extends {
    public static void main(String[] args) {
        Dog dog = new Dog("mammals", 6, 25, "yellow");
        dog.eat();
        System.out.println(dog.getSpecies());
    }
}
