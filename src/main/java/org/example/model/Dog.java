package org.example.model;

public class Dog extends Animal {
    private double weight;
    private String color;
    private int number;

    public Dog(String species) {
        super(species);
    }

    @Override
    public void eat() {
        System.out.println("啃骨頭");
    }

    public Dog(String species, int number, double weight, String color) {
        super(species);
        this.number = number;
        this.weight = weight;
        this.color = color;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}