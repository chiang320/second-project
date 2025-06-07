package org.example.model;

public class BeefStewWithPotato {
    private int onion;
    private int pork;
    private int potato;
    private int scallion;
    private int sauce;

    public BeefStewWithPotato(int onion, int pork, int potato, int scallion, int sauce) {
        this.onion = onion;
        this.pork = pork;
        this.potato = potato;
        this.scallion = scallion;
        this.sauce = sauce;
    }

    public void serve() {
        System.out.println("上菜");
    }

    public String serve(String name) {
        return name + "上菜";
    }
}

