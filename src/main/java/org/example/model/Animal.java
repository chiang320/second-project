package org.example.model;

class Animal {
    private String species;


    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(species + "在吃東西");
    }

    public String getSpecies() {
        return species;

    }
}
